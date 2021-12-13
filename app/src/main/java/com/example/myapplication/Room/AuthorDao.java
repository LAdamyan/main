package com.example.myapplication.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AuthorDao {
    @Query("SELECT *FROM authors")
    List<Authors> getAuthors();

    @Insert
    void insert(Authors authors);

    @Delete
    void delete(Integer id);

}
