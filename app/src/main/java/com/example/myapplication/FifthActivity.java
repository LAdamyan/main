package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class FifthActivity extends AppCompatActivity {


    TextView result;
    String str;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_activity);

        result=findViewById(R.id.textView_enterName);
        str = (String) getIntent().getExtras().get("Value");
        result.setText(str);


        ProgressBar progressBar = findViewById(R.id.progressBar2);
        AppCompatButton showButton = findViewById(R.id.button1);
        AppCompatButton hideButton = findViewById(R.id.button2);


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
