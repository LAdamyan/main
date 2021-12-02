package com.example.myapplication.recycleView2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class FilterActivity extends AppCompatActivity {


    public FilterAdapter filterAdapter = new FilterAdapter();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorting_layout);
        initRecycleView();


    }
    public void initRecycleView(){
        RecyclerView recyclerView= findViewById(R.id.sorting_recycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(filterAdapter);
        filterAdapter.setCategory(Category.getCategoryItems());
    }



}



