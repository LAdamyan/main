package com.example.myapplication.firstApp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;


public class ImageFragment extends Fragment implements onItemClickListener {

    ImageAdapter imageAdapter = new ImageAdapter();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycle_image_fragment);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(imageAdapter);
        imageAdapter.setMyUrls(Gallery.getGlideImages());
        imageAdapter.setOnItemClickListener(this);

        return view;
    }



    @Override
    public void click(String imageUrl) {

        Bundle bundle = new Bundle();
        bundle.putString("imageUrl", Gallery.getImageUrl());
        FullImageFragment fullImageFragment = new FullImageFragment();
        fullImageFragment.setArguments(bundle);
        FragmentManager fragmentManager = getParentFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity4_fragment_container, fullImageFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
