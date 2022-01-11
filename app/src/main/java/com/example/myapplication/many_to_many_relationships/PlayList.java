package com.example.myapplication.many_to_many_relationships;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class PlayList {

    @PrimaryKey
    int playListId;
    String playListName;
}

@Entity
class Song{

    @PrimaryKey
    int songId;
    String songName;
    String artist;

}

@Entity(primaryKeys = {"playlistId","songId"})

class PlayListSongCrossRef{
    int playListId;
    int songId;
}
