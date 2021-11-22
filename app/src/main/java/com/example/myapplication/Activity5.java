package com.example.myapplication;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.fragment.SharedFragment1;
import com.example.myapplication.fragment.SharedFragment2;
import com.example.myapplication.fragment.ThirdFragment;

import java.util.Objects;

public class Activity5 extends AppCompatActivity {

    AppCompatEditText editText;
    AppCompatButton button;
    AppCompatButton button2;


    final String SAVED_TEXT= "saved text";
    String savedText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_shared1);

        SharedFragment1 sharedFragment1 = new SharedFragment1();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.shared_fragment_container,sharedFragment1);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

        editText= findViewById(R.id.shared_textview);
        button = findViewById(R.id.shared_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveText();
            }
        });


        button2 = findViewById(R.id.shared_data_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedFragment2 sharedFragment2 = new SharedFragment2();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.shared2_fragment_container,sharedFragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        }

    private void saveText(){
        SharedPreferences sharedPreferences = getSharedPreferences(SAVED_TEXT,MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(SAVED_TEXT,"text");
        edit.apply();
    }
   private  void loadText(){
       SharedPreferences sharedPreferences = getSharedPreferences(SAVED_TEXT,MODE_PRIVATE);
       savedText = sharedPreferences.getString(SAVED_TEXT,"New text");
       editText.setText(savedText);
   }

}
