package com.example.myapplication.Room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface VideoDao {

    @Query("SELECT *FROM videos")
    List<Videos> getVideos();

    @Insert
    void insert(Videos videos);

    @Delete
    void delete(Videos videos);

}
