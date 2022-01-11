package com.example.myapplication.one_to_many_relationships;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
interface UserDao {

    @Transaction
    @Query("SELECT * FROM User")

    public List<UserWithPlayLists> getUsersWithPlayLists();


}
