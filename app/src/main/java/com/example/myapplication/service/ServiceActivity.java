package com.example.myapplication.service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.myapplication.R;
import com.example.myapplication.service.NewService;

public class ServiceActivity extends AppCompatActivity implements View.OnClickListener {


    private AppCompatButton startButton;
    private AppCompatButton stopButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service_layout);

        startButton = findViewById(R.id.start_service);
        stopButton = findViewById(R.id.stop_service);

        startButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == startButton) {
            startService(new Intent(this, NewService.class));
        } else if (view == stopButton) {
            stopService(new Intent(this, NewService.class));
        }
    }
}