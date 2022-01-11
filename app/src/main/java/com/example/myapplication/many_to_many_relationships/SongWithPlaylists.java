package com.example.myapplication.many_to_many_relationships;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class SongWithPlaylists {

    @Embedded
    public Song song;

    @Relation(
            parentColumn = "songId",
            entityColumn = "playlistId",
            associateBy = @Junction(PlayListSongCrossRef.class)
    )
    public List<PlayList> playListList;
}
