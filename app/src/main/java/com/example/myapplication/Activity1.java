package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit1);
        openSecondActivity();
        openThirdActivity();

    }

    public void openSecondActivity() {
        AppCompatButton button1 = findViewById(R.id.appCompatButton1);
        button1.setOnClickListener(view -> {
            Intent intent1 = new Intent(Activity1.this, Activity2.class);
            startActivityForResult(intent1,RESULT_OK);

        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && data!= null ){
            String returnString = data.getStringExtra("text");
            String returnString2 = data.getStringExtra("tex2");
            AppCompatTextView textView = findViewById(R.id.textView_returned);
            AppCompatTextView textView2 = findViewById(R.id.textView_returned2);
            textView.setText(returnString);
            textView2.setText(returnString2);

        }
    }

    public void openThirdActivity(){
        AppCompatButton  button2 =  findViewById(R.id.appCompatButton2);
        button2.setOnClickListener(view -> {
            Intent intent1 = new Intent(Activity1.this, Activity3.class);
            startActivityForResult(intent1,RESULT_OK);
            });

    }


}
