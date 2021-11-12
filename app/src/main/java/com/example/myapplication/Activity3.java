package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class Activity3 extends AppCompatActivity {


    AppCompatEditText editText2;
    AppCompatButton button2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit3);

        editText2= findViewById(R.id.editText_pass2);
        button2 =findViewById(R.id.button_back2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }


    @Override
    public void onBackPressed() {
        if(editText2!=null){
            String message = editText2.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("text2",message);
            setResult(RESULT_OK,intent);
        }
        super.onBackPressed();

    }
}
