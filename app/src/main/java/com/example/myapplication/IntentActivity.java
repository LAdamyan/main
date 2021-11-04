package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_types);


        AppCompatButton button = findViewById(R.id.call);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mobileNumber = "99XXXXXXXX";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: " + mobileNumber));
                startActivity(intent);
            }

        });


        AppCompatButton buttonShare = findViewById(R.id.send);
        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                AppCompatEditText editText = findViewById(R.id.editText_intent);
                String message = String.valueOf(editText.getText());
                intent.putExtra(Intent.EXTRA_TEXT, message);
                Intent modIntent = Intent.createChooser(intent, "Send With..");
                startActivity(modIntent);
            }
        });


        AppCompatButton buttonUrl = findViewById(R.id.open_url);
        buttonUrl.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_APP_BROWSER);
                startActivity(intent.createChooser(intent, "Select Browser"));

            }

        });


            }


}
