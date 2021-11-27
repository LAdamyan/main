package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Gallery;
import com.example.myapplication.Profile;
import com.example.myapplication.ProfilePageAdapter;
import com.example.myapplication.R;
import com.example.myapplication.onItemClickListener;
import com.example.myapplication.onItemClickListener2;


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
        profilePageAdapter.setOnItemClickListener2(this);

        return view;
    }


    @Override
    public void onClick(int image, String name, String surName, String imageUrl) {
        GalleryFragment galleryFragment = new GalleryFragment();
        if(getActivity()!=null){
            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.activity4_fragment_container,galleryFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}