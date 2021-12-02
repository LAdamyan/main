package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.fragment.ForestFragment;
import com.example.myapplication.fragment.MountainFragment;
import com.example.myapplication.fragment.OceanFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                MountainFragment mountainFragment = new MountainFragment();
                Bundle args1 = new Bundle();
                args1.putInt(MountainFragment.ARG_OBJECT, position + 1);
                mountainFragment.setArguments(args1);
                return mountainFragment;
            case 1 :
                OceanFragment oceanFragment = new OceanFragment();
                Bundle args2 = new Bundle();
                args2.putInt(OceanFragment.ARG_OBJECT,position + 1);
                oceanFragment.setArguments(args2);
                return  oceanFragment;
            case 2 :
                ForestFragment forestFragment = new ForestFragment();
                Bundle args3 = new Bundle();
                args3.putInt(ForestFragment.ARG_OBJECT,position + 1);
                forestFragment.setArguments(args3);
                return forestFragment;
        }
        return new ForestFragment();
    }


    @Override
    public int getItemCount() {
        return 3;
    }
}