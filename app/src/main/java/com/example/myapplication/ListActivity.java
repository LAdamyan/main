package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {

     public FirstRCAdapter firstRCAdapter = new FirstRCAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        initRecycleView();
    }

    private void initRecycleView() {

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(firstRCAdapter);

        firstRCAdapter.SetEntertainments(Entertainments.getEntertainments());


    }


}
