package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuActivity extends AppCompatActivity   {

    MenuHorizontalAdapter horizontalAdapter = new MenuHorizontalAdapter();
    MenuVerticalAdapter verticalAdapter = new MenuVerticalAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_layout);
        initHorizontalRecycleView();
        initVerticalRecycleView();
    }

    private void initHorizontalRecycleView() {
        RecyclerView recyclerHorizontal = findViewById(R.id.recycle_horizontal);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerHorizontal.setLayoutManager(linearLayoutManager);
        recyclerHorizontal.setAdapter(horizontalAdapter);
        horizontalAdapter.setMenuHorizontal(MenuHorizontal.getMenuItems());
    }

    private void initVerticalRecycleView() {
        RecyclerView recyclerVertical = findViewById(R.id.recycle_vertical);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerVertical.setLayoutManager(gridLayoutManager);
        recyclerVertical.setAdapter(verticalAdapter);
        verticalAdapter.setMenu(MenuVertical.getMenuItems());


    }




}

