package com.example.myapplication.screenSlidePager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.R;

public class ScreenSlidePageActivity extends FragmentActivity {

    private ViewPager2  viewPager2;
    private ScreenSlidePageAdapter screenSlidePageAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_slide);

        viewPager2= findViewById(R.id.pager);
        screenSlidePageAdapter = new ScreenSlidePageAdapter(getSupportFragmentManager(),getLifecycle()) ;
        viewPager2.setAdapter(screenSlidePageAdapter);

        viewPager2.setPageTransformer(new ZoomOutPageTransformer());
        viewPager2.setPageTransformer(new DepthPageTransformer());
    }

    @Override
    public void onBackPressed() {
        if(viewPager2.getCurrentItem()==0){
            super.onBackPressed();
        }else{
            viewPager2.setCurrentItem(viewPager2.getCurrentItem()-1);
        }

    }
}



