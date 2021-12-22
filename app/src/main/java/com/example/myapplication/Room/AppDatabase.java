package com.example.myapplication.Room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(
        entities = {Authors.class,
                    Videos.class},
        version = 1
)
abstract class AppDatabase extends RoomDatabase {

    private static final String FDB_Name = "first_db";
    private static volatile AppDatabase INSTANCE;

    public abstract AuthorDao getAuthorsDao();
    public abstract VideoDao getVideosDao();



    public static synchronized AppDatabase getInstance(Context context) {

        if (INSTANCE == null) {
            Builder<AppDatabase> appDatabaseBuilder = Room.databaseBuilder(
                    context,
                    AppDatabase.class, FDB_Name);
            INSTANCE = appDatabaseBuilder.
                    fallbackToDestructiveMigration().
                    allowMainThreadQueries().build();


        }return INSTANCE;
    }
}
