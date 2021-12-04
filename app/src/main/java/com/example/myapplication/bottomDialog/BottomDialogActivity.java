package com.example.myapplication.bottomDialog;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.myapplication.R;

public class BottomDialogActivity extends AppCompatActivity {

    AppCompatButton button;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_dialog_activity);

        button = findViewById(R.id.button_bottom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            BottomDialogFragment bottomDialogFragment = BottomDialogFragment.newInstance();
            bottomDialogFragment.show(getSupportFragmentManager(),null);
            }
        });
    }
}
