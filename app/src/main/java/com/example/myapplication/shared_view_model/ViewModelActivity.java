package com.example.myapplication.shared_view_model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class ViewModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_layout);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container_viewModel,new Fragment1())
                .commit();
    }
}
