package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GlideActivity extends AppCompatActivity {

    ImageAdapter imageAdapter = new ImageAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glide_recycle);
        initImageRecycle();

    }

    private void initImageRecycle(){
        RecyclerView recyclerView = findViewById(R.id.recycle_glide);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(imageAdapter);
        imageAdapter.setMyUrls(GlideImage.getGlideImages());
    }



}
