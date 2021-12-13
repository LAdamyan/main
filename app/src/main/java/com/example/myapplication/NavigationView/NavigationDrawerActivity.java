package com.example.myapplication.NavigationView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;


import com.example.myapplication.R;
import com.google.android.material.navigation.NavigationView;

public class NavigationDrawerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView = findViewById(R.id.nav_view);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                  drawerLayout.open();
            }
        });


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,
                R.string.open_drawer, R.string.close_drawer){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        actionBarDrawerToggle.syncState();


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.gallery : {
                        Toast.makeText(NavigationDrawerActivity.this,"Gallery",Toast.LENGTH_SHORT).show();
                        drawerLayout.close();
                        break;
                    }
                    case  R.id.contacts : {
                        Toast.makeText(NavigationDrawerActivity.this,"Contacts",Toast.LENGTH_SHORT).show();
                        drawerLayout.close();
                        break;
                    }
                    case  R.id.settings:  {
                        Toast.makeText(NavigationDrawerActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                        drawerLayout.close();
                        break;
                    }
                    case  R.id.share:  {
                        Toast.makeText(NavigationDrawerActivity.this,"Share",Toast.LENGTH_SHORT).show();
                        drawerLayout.close();
                        break;
                    }
                }return true;

            }
        });

    }
}

