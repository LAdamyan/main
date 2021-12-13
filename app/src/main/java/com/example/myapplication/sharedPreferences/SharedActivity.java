package com.example.myapplication.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.myapplication.R;

public class SharedActivity extends AppCompatActivity {
    SharedPreferences sharedpreferences;
    AppCompatEditText name;
    AppCompatEditText surName;
    public static final String MYPREFERENCES = "mypref";
    public static final String NAME = "nameKey";
    public static final String SURNAME = "surnameKey";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shared_pref);
         AppCompatButton saveBtn = findViewById(R.id.save_button);
         saveBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 save();
             }
         });
        AppCompatButton retrieveBtn = findViewById(R.id.save_retrieve);
        retrieveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                get();
            }
        });
        AppCompatButton clearBtn = findViewById(R.id.save_clear);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        name =  findViewById(R.id.editName);
        surName =  findViewById(R.id.editSurname);
        sharedpreferences = getSharedPreferences(MYPREFERENCES,
                Context.MODE_PRIVATE);
        if (sharedpreferences.contains(NAME)) {
            name.setText(sharedpreferences.getString(NAME, ""));
        }
        if (sharedpreferences.contains(SURNAME)) {
            surName.setText(sharedpreferences.getString(SURNAME, ""));

        }

    }
    public void save() {
        String n = name.getText().toString();
        String s = surName.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(NAME, n);
        editor.putString(SURNAME, s);
        editor.apply();
    }

    public void clear() {
        name.setText("");
        surName.setText("");

    }

    public void get() {
        sharedpreferences = getSharedPreferences(MYPREFERENCES,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(NAME)) {
            name.setText(sharedpreferences.getString(NAME, ""));
        }
        if (sharedpreferences.contains(SURNAME)) {
            surName.setText(sharedpreferences.getString(SURNAME, ""));

        }
    }




}
