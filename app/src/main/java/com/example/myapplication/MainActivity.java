package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_relative);

       /* AppCompatTextView newPassword = findViewById(R.id.new_password);
        newPassword.setText("New password");
        newPassword.setTextColor(ContextCompat.getColor(this,R.color.black));

        AppCompatButton saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(view -> Toast.makeText(MainActivity.this,"Your password has changed ",
                Toast.LENGTH_LONG).show());
*/



    }
}