package com.example.myapplication.Room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

public class MainDatabaseActivity extends AppCompatActivity {

    RoomDatabase.Builder<AppDatabase> fb = Room.databaseBuilder(
            this,
            AppDatabase.class,
            "first_db"
    );

    AppDatabase db = fb.build();
    List<Authors> authorsList = db.getAuthorsDao().getAuthors();


}


