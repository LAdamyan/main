package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class FourthActivity extends AppCompatActivity {


    String name;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

         AppCompatEditText editName = findViewById(R.id.editName);
         AppCompatButton enterButton= findViewById(R.id.enter_button);


        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                name = editName.getText().toString();
                intent.putExtra("Value", name);
                startActivity(intent);
                finish();

            }
        });

    }
}
