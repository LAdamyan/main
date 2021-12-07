package com.example.myapplication.firstApp.Profile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.firstApp.Image.ImageFragment;
import com.example.myapplication.firstApp.Video.VideoFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0 :
                return new ImageFragment();
            case 1:
                return new VideoFragment();
        }
        return new ImageFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
