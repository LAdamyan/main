package com.example.myapplication.thread;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.R;

public class ThreadActivity extends AppCompatActivity {

    AppCompatTextView textView;
    Handler handler = new Handler();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thread);

        textView = findViewById(R.id.text_in_thread);
        Thread t = new Thread() {
            public void run() {
                handler.post(new Runnable() {
                    @SuppressLint("SetTextI18n")
                    public void run() {
                        textView.setText("New TextView");
                    }
                });
            }
        };
        t.start();
    }
}
