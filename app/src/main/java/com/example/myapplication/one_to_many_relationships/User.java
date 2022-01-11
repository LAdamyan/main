package com.example.myapplication.one_to_many_relationships;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey
    long userId;
    String name;
    int age;

}

@Entity
class PlayList {

    @PrimaryKey
    long playListId;
    long userCreatorId;
    long playListName;

}
