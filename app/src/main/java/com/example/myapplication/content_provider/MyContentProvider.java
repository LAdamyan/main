package com.example.myapplication.content_provider;

import static androidx.room.RoomMasterTable.TABLE_NAME;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;

import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Database;

import java.util.HashMap;

public class MyContentProvider extends ContentProvider {

    static final String PROVIDER_NAME = "com.example.myapplication";

    static final String URL="content://" + PROVIDER_NAME + "/content_provider";

    static final Uri CONTENT_URI = Uri.parse(URL);

    static final String id = "id";
    static final String name = "name";
    static final int uriCode = 1;
    static final UriMatcher uriMatcher ;
    private static HashMap<String ,String>values;




    static{
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDER_NAME,"content_provider",uriCode);
        uriMatcher.addURI(PROVIDER_NAME,"content_provider/*",uriCode);

    }

    private SQLiteDatabase db;

    @Override
    public String getType( Uri uri) {
        switch (uriMatcher.match(uri)){
            case uriCode:
                return "vnd.android.cursor.dir/content_provider";
            default:
                throw new IllegalArgumentException("Unsupported URI:" + uri);
        }

    }


    @Override
    public boolean onCreate() {
        Context context = getContext();
        DatabaseHelper  databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getWritableDatabase();
        if(db != null){
            return true;
        }
        return false;
    }


    @Override
    public Cursor query( Uri uri, String[] projection,  String selection,
                         String[] selectionArgs, String sortOrder) {

        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables(TABLE_NAME);
        switch (uriMatcher.match(uri)) {
            case uriCode:
                qb.setProjectionMap(values);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
        if (sortOrder == null || sortOrder == "") {
            sortOrder = id;
        }
        Cursor cursor  = qb.query(db,projection,selection,selectionArgs,null,null,sortOrder);
        cursor.setNotificationUri(getContext().getContentResolver(),uri);
        return  cursor;
    }




    @Override
    public Uri insert( Uri uri, ContentValues contentValues) {
        long rowID = db.insert(TABLE_NAME,"",contentValues);
        if (rowID > 0){
            Uri _uri = ContentUris.withAppendedId(CONTENT_URI,rowID);
            getContext().getContentResolver().notifyChange(_uri,null);
            return _uri;
        }
       throw  new SQLException("Failed to add record into " + uri);

    }

    @Override
    public int update( Uri uri,ContentValues contentValues,  String selection,  String[] selectionArgs) {
        int count = 0;
        switch (uriMatcher.match(uri)){
            case uriCode:
                count = db.update(TABLE_NAME,contentValues,selection,selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);

        }
        getContext().getContentResolver().notifyChange(uri,null);
        return count;
    }

    @Override
    public int delete( Uri uri,  String selection,String[] selectionArgs) {
       int count = 0;
       switch (uriMatcher.match(uri)){
           case uriCode:
               count =db.delete(TABLE_NAME,selection,selectionArgs);
               break;
           default:
               throw new IllegalArgumentException("Unknown URI " + uri);

       }
       getContext().getContentResolver().notifyChange(uri,null);
       return count;
    }





    private static class DatabaseHelper extends SQLiteOpenHelper{

        private SQLiteDatabase db;
        static final String DATABASE_NAME = "UserDB";
        static final String TABLE_NAME = "Users";
        static final int DATABASE_VERSION= 1;
        static final String CREATE_DB_TABLE = "CREATE TABLE " + TABLE_NAME
                + "(id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + " name TEXT NOT NULL ) ";

        public DatabaseHelper( Context context) {
            super(context, DATABASE_NAME, null ,DATABASE_VERSION);
        }


        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(CREATE_DB_TABLE);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
           onCreate(db);
        }
    }
}
