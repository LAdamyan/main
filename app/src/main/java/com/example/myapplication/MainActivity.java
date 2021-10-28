package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_views);

        View view = LayoutInflater.from(this).inflate(R.layout.new_views,null);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    /*  SwitchCompat switchPin = findViewById(R.id.switch_pin);
        SwitchCompat closeBlock = findViewById(R.id.block);
        switchPin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this,"ON",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"OFF",Toast.LENGTH_SHORT).show();
                }
            }
        });
        closeBlock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isBlocked) {
                if(isBlocked){
                    Toast.makeText(MainActivity.this,"Block is on",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"Block is off",Toast.LENGTH_SHORT).show();
                }
            }
        });*/


        /*RadioButton spicy = findViewById(R.id.radioButton1);
        RadioButton original = findViewById(R.id.radioButton2);

        CheckBox checkBox1 = findViewById(R.id.checkbox1);
        CheckBox checkBox2 = findViewById(R.id.checkbox2);
        CheckBox checkBox3 = findViewById(R.id.checkbox3);
        TextView addCard = findViewById(R.id.add_to_car_textView);


        addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, checkBox1.getText(),Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, spicy.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        if (checkBox1 != null) {
            checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        Toast.makeText(MainActivity.this, "isChecked", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "unChecked", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
*/

}

       /* AppCompatTextView newPassword = findViewById(R.id.new_password);
        newPassword.setText("New password");
        newPassword.setTextColor(ContextCompat.getColor(this,R.color.black));

        AppCompatButton saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(view -> Toast.makeText(MainActivity.this,"Your password has changed ",
                Toast.LENGTH_LONG).show());
*/




