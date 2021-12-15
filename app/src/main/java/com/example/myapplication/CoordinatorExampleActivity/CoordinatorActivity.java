package com.example.myapplication.CoordinatorExampleActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class CoordinatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coordinator_example);

    }

    public static void start(Context c) {
        c.startActivity(new Intent(c, CoordinatorActivity.class));
    }

}
