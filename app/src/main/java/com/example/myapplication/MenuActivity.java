package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuActivity extends AppCompatActivity  implements ItemClickListener{

    MenuHorizontalAdapter horizontalAdapter = new MenuHorizontalAdapter();
    MenuVerticalAdapter verticalAdapter = new MenuVerticalAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_layout);
        initRecycleView();
    }

    private void initRecycleView() {
        RecyclerView recyclerHorizontal = findViewById(R.id.recycle_horizontal);
        RecyclerView recyclerVertical = findViewById(R.id.recycle_vertical);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerHorizontal.setLayoutManager(linearLayoutManager);
        recyclerHorizontal.setAdapter(horizontalAdapter);
        horizontalAdapter.SetMenuHorizontal(MenuHorizontal.getMenuItems());


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerVertical.setLayoutManager(gridLayoutManager);
        recyclerVertical.setAdapter(verticalAdapter);
        verticalAdapter.SetMenu(MenuVertical.getMenuItems());
        horizontalAdapter.setItemClickListener(this);

    }


    @Override
    public void click(String text) {

    }
}
