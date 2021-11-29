package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Gallery;
import com.example.myapplication.ImageAdapter;
import com.example.myapplication.R;
import com.example.myapplication.onItemClickListener;


public class GalleryFragment extends Fragment implements onItemClickListener {

    ImageAdapter imageAdapter = new ImageAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycle_glide);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(imageAdapter);
        imageAdapter.setMyUrls(Gallery.getGlideImages());
        imageAdapter.setOnItemClickListener();

        return view;
    }

    @Override
    public void onClick(String imageUrl) {



    }
}