package com.example.myapplication.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "authors")
public class Authors {

    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String age;




}
