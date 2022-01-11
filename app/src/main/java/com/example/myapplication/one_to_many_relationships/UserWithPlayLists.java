package com.example.myapplication.one_to_many_relationships;

import androidx.room.Embedded;
import androidx.room.Relation;
import com.example.myapplication.one_to_one_relationships.User;
import java.util.List;

public class UserWithPlayLists {

    @Embedded public User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "userCreatorId"
    )
    public List<PlayList> playListList;
}
