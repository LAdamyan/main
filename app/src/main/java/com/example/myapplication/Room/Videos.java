package com.example.myapplication.Room;

import androidx.room.Entity;

import java.util.List;

@Entity
public class Videos {

    Integer id;
    String name;
    String age;
    List<Integer > videosIds;
}
