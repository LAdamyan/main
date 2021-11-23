package com.example.myapplication;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.example.myapplication.fragment.SharedFragment1;

public class Activity5 extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_shared1);

        SharedFragment1 sharedFragment1 = new SharedFragment1();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.shared_fragment_container,sharedFragment1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();





}}
