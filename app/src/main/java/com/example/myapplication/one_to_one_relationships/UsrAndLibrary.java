package com.example.myapplication.one_to_one_relationships;

import androidx.room.Embedded;
import androidx.room.Relation;

class UserAndLibrary {
    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userOwnerId"
    )
    public Library library;
}
