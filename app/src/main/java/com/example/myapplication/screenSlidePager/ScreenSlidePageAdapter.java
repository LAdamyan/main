package com.example.myapplication.screenSlidePager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ScreenSlidePageAdapter extends FragmentStateAdapter {

    private static final int NUM_PAGES = 5;

    public ScreenSlidePageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new ScreenSlidePageFragment1();
            case 1:
                return new ScreenSlidePageFragment2();
            case 2:
                return new ScreenSlidePageFragment3();
            case 3:
                return new ScreenSlidePageFragment4();
            case 4:
                return new ScreenSlidePageFragment5();
        }
        return new ScreenSlidePageFragment1();
    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
