package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class MainActivity extends AppCompatActivity {

    String name;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);

        AppCompatEditText editName = findViewById(R.id.editName);
        AppCompatButton enterButton = findViewById(R.id.enter_button);


        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, FifthActivity.class);
                name = editName.getText().toString();
                intent.putExtra("Value", name);
                startActivity(intent);
                finish();

            }
        });
        if(savedInstanceState!= null){
            name =savedInstanceState.getString("Value");
            editName.setText(String.valueOf(name));
        }

    }

    @Override
    protected void onSaveInstanceState( Bundle outState) {
        outState.putString("Value",name);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gallery:
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.settings:
                Intent intent1 = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent1);

                break;
            default:

                super.onOptionsItemSelected(item);
        }

        return super.onOptionsItemSelected(item);
    }}*/
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



       /* AppCompatTextView newPassword = findViewById(R.id.new_password);
        newPassword.setText("New password");
        newPassword.setTextColor(ContextCompat.getColor(this,R.color.black));

        AppCompatButton saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(view -> Toast.makeText(MainActivity.this,"Your password has changed ",
                Toast.LENGTH_LONG).show());
*/




