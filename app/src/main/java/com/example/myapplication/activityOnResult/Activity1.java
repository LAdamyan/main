package com.example.myapplication.activityOnResult;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.intent.Activity2;
import com.example.myapplication.intent.Activity3;
import com.example.myapplication.R;

public class Activity1 extends AppCompatActivity {

    public static final String ACCESS_MESSAGE1 = "test1";
    public static final String ACCESS_MESSAGE2 = "test2";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit1);
        openSecondActivityForResult();
        openThirdActivityForResult();


    }

    public void openSecondActivityForResult() {
        AppCompatButton button1 = findViewById(R.id.appCompatButton1);
        button1.setOnClickListener(view -> {
            startForResults.launch(new Intent(this, Activity2.class));

        });
    }

    public void openThirdActivityForResult() {
        AppCompatButton button2 = findViewById(R.id.appCompatButton2);
        button2.setOnClickListener(view -> {
            startForResults.launch(new Intent(this, Activity3.class));
        });

    }

    ActivityResultLauncher<Intent> startForResults = registerForActivityResult(
                            new ActivityResultContracts.StartActivityForResult(),
            result -> {

                AppCompatTextView textView = findViewById(R.id.textView_returned);
                AppCompatTextView textView2 = findViewById(R.id.textView_returned2);

                if (result.getResultCode() == Activity1.RESULT_OK) {
                    Intent data = result.getData();
                    if(data != null) {
                        String returnString = data.getStringExtra(ACCESS_MESSAGE1);
                        String returnString2 = data.getStringExtra(ACCESS_MESSAGE2);
                        textView.setText(returnString);
                        textView2.setText(returnString2);
                    }

                }
            });


}
