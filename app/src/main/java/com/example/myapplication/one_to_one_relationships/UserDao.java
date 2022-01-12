package com.example.myapplication.one_to_one_relationships;

import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

interface UserDao {

    @Transaction
    @Query("SELECT * FROM  User")

    public List<UserAndLibrary> getUsersAndLibraries();

}
