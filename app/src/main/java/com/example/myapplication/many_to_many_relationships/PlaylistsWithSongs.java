package com.example.myapplication.many_to_many_relationships;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class PlaylistsWithSongs {

    @Embedded
    public PlayList playList;

    @Relation(
            parentColumn = "playListId",
            entityColumn = "songId",
            associateBy = @Junction(PlayListSongCrossRef.class))

    public List<Song> songs;
}
