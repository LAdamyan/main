package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.fragment.ForestFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager2 viewPager2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_layout);

  //     viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
       viewPager2 = findViewById(R.id.viewPager);
       viewPager2.setAdapter(viewPagerAdapter);

       TabLayout tabLayout= findViewById(R.id.tabLayout);
       new TabLayoutMediator(tabLayout,viewPager2,((tab, position) -> tab.setText("OBJECT" + (position+1)))).attach();
    }
}
