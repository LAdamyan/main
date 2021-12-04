package com.example.myapplication.firstApp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;


public class GalleryFragment extends Fragment implements onItemClickListener {

    ImageAdapter imageAdapter = new ImageAdapter();
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager2 viewPager2;

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

        viewPager2= view.findViewById(R.id.gallery_viewPager);
        tabLayout = view.findViewById(R.id.gallery_tabLayout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.image_multiple_outline));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.message_video));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;

    }
    @Override
    public void onClick(String imageUrl) {


    }

}