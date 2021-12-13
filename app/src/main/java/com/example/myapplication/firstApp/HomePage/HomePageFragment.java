package com.example.myapplication.firstApp.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.firstApp.FullImage.FullImageFragment;
import com.example.myapplication.firstApp.Profile.ProfileFragment;


public class HomePageFragment extends Fragment implements ItemClickListener {

    HomePageAdapter profilePageAdapter = new HomePageAdapter();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.home_page_recycle, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.home_page_recycle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(profilePageAdapter);
        profilePageAdapter.setProfiles(HomePageProfile.getHomePageProfile());
        profilePageAdapter.setItemClickListener(this);

        return view;
    }


    @Override
    public void onClick(String name, String surname) {
        ProfileFragment profileFragment = new ProfileFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity4_fragment_container, profileFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void openFullImage(String imageUrl) {
        Bundle bundle = new Bundle();
        bundle.putString("imageUrl", imageUrl);
        FullImageFragment fullImageFragment = new FullImageFragment();
        fullImageFragment.setArguments(bundle);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity4_fragment_container, fullImageFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}