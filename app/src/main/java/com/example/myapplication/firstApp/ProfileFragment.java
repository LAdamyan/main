package com.example.myapplication.firstApp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;


public class ProfileFragment extends Fragment implements onItemClickListener2 {

    ProfilePageAdapter profilePageAdapter = new ProfilePageAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.profile_recycle, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.profile_recycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(profilePageAdapter);
        profilePageAdapter.setProfiles(Profile.getProfile());
        profilePageAdapter.setOnItemClickListener2();

        return view;
    }


    @Override
    public void onClick(int image, String name, String surName, String imageUrl) {


    }


}