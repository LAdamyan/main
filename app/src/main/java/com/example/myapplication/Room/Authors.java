package com.example.myapplication.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class Authors {
    @PrimaryKey
    Integer id;
    String name;
    String age;
    List<Integer> picturesIds;


}
