package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuActivity extends AppCompatActivity implements ItemClickListener {

    private MenuAdapter horizontalAdapter = new MenuAdapter();
    private MenuAdapter verticalAdapter = new MenuAdapter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_layout);
        initRecycleView();
    }
    private void initRecycleView(){
        RecyclerView recyclerHorizontal = findViewById(R.id.recycle_horizontal);
        RecyclerView recyclerVertical = findViewById(R.id.recycle_vertical);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerHorizontal.setLayoutManager(linearLayoutManager);
        recyclerHorizontal.setAdapter(horizontalAdapter);
       horizontalAdapter.SetMenu(Menu.getMenuItems());
       horizontalAdapter.setOnItemClickListener(this);

       verticalAdapter.SetMenu(Menu.getMenuItems());
       GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false);
        recyclerVertical.setLayoutManager(gridLayoutManager);
        recyclerVertical.setAdapter(verticalAdapter);

    }

    @Override
    public void onclick(String text) {
        System.out.println(text);
    }
}
