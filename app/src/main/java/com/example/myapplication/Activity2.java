package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

public class Activity2 extends AppCompatActivity {


     AppCompatEditText editText;
     AppCompatButton button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        editText= findViewById(R.id.editText_pass);
        button1 =findViewById(R.id.button_back);
        button1.setOnClickListener(view -> onBackPressed());
    }

    @Override
    public void onBackPressed() {

            String message = editText.getText().toString();
            if(editText!=null) {
                Intent intent = new Intent();
                intent.putExtra(Activity1.ACCESS_MESSAGE1, message);
                setResult(RESULT_OK, intent);
                finish();

        }
        super.onBackPressed();
    }
}





