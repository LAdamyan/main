package com.example.myapplication.progressBar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        AppCompatButton showButton = findViewById(R.id.button1);
        AppCompatButton hideButton = findViewById(R.id.button2);

        AppCompatButton getRating  = findViewById(R.id.button3);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        getRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int stars = (int) ratingBar.getRating();
                Toast.makeText(SecondActivity.this,"Your rate is  " + stars + " stars",Toast.LENGTH_LONG).show();
            }
        });



        showButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 progressBar.setVisibility(View.VISIBLE);
             }
         });
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });


    }
}