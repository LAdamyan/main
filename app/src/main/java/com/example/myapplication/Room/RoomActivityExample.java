package com.example.myapplication.Room;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myapplication.R;

import java.util.List;

public class RoomActivityExample extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_layout);
    }

    RoomDatabase.Builder<AppDatabase>FirstBuilder = Room.databaseBuilder(this,
            AppDatabase.class,"first db");
    AppDatabase db = FirstBuilder.build();
    List<Authors> authors = db.getAuthorsDao().getAuthors();
    List<Videos>videos = db.getVideosDao().getVideos();
}
