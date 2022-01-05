package com.example.myapplication.bottomNavigationView;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation_layout);


        BottomNavigationView bottomNavigationView  = findViewById(R.id.bottom_navigation);



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.restaurants:
                        BottomFragmentOne bottomFragmentOne = new BottomFragmentOne();
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.bottom_nav_fragment_container,bottomFragmentOne);
                        fragmentTransaction.commit();
                    case R.id.shops:
                        BottomFragmentTwo bottomFragmentTwo = new BottomFragmentTwo();
                        FragmentManager fragmentManager2 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
                        fragmentTransaction2.replace(R.id.bottom_nav_fragment_container,bottomFragmentTwo);
                        fragmentTransaction2.commit();
                        break;
                    case R.id.carrefour:
                        BottomFragmentThree bottomFragmentThree = new BottomFragmentThree();
                        FragmentManager fragmentManager3 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction3 = fragmentManager3.beginTransaction();
                        fragmentTransaction3.replace(R.id.bottom_nav_fragment_container,bottomFragmentThree);
                        fragmentTransaction3.commit();
                        break;
                    case R.id.offers:
                        BottomFragmentFour bottomFragmentFour = new BottomFragmentFour();
                        FragmentManager fragmentManager4 = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction4 = fragmentManager4.beginTransaction();
                        fragmentTransaction4.replace(R.id.bottom_nav_fragment_container,bottomFragmentFour);
                        fragmentTransaction4.commit();
                        break;
                }



                return false;
            }
        });

}}
