package com.example.myapplication.viewPager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.viewPager.ForestFragment;
import com.example.myapplication.viewPager.MountainFragment;
import com.example.myapplication.viewPager.OceanFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new MountainFragment();
            case 1 :

                return  new OceanFragment();
            case 2 :

                return new ForestFragment();
        }
        return new ForestFragment();
    }


    @Override
    public int getItemCount() {
        return 3;
    }
}