package com.example.myapplication.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "videos")
public class Videos {

@PrimaryKey(autoGenerate = true)
    int id;

    String videoUrl;


}
