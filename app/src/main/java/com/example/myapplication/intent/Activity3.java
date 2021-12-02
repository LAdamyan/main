package com.example.myapplication.intent;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.myapplication.R;
import com.example.myapplication.activityOnResult.Activity1;

public class Activity3 extends AppCompatActivity {


    AppCompatEditText editText2;
    AppCompatButton button2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit3);

        editText2= findViewById(R.id.editText_pass2);
        button2 =findViewById(R.id.button_back2);
        button2.setOnClickListener(view -> onBackPressed());
    }


    @Override
    public void onBackPressed() {
        if(editText2!=null) {
            String message = editText2.getText().toString();
            Intent intent = new Intent();
            intent.putExtra(Activity1.ACCESS_MESSAGE2,message);
            setResult(RESULT_OK,intent);
            finish();
        }
        super.onBackPressed();

    }
}
