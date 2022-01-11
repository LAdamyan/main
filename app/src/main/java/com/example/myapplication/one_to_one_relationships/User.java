package com.example.myapplication.one_to_one_relationships;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey
    public long userId;
    public String name;
    public int age;
}

@Entity
class Library {
    @PrimaryKey
    public long libraryId;
    public long userOwnerId;
}
