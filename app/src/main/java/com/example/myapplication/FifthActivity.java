package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class FifthActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

        AppCompatTextView result=findViewById(R.id.textView_enterName);
        String str = (String) getIntent().getExtras().get("Value");
        result.setText(str);


         progressBar = findViewById(R.id.progressBar2);
        AppCompatButton showButton = findViewById(R.id.button1);
        AppCompatButton hideButton = findViewById(R.id.button2);


        showButton.setOnClickListener(view -> progressBar.setVisibility(View.VISIBLE));
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
