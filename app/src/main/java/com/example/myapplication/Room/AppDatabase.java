package com.example.myapplication.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities = {Authors.class,
                    Videos.class},
        version = 1
)
abstract class AppDatabase extends RoomDatabase {

    public abstract AuthorDao getAuthorsDao();
    public abstract VideoDao getVideosDao();
}
