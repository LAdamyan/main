package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chip_layout);

        alert1Click();
        alert2Click();
        alert3Click();
        alert4Click();
    }

    private void alert1Click() {
        Button alert1 = findViewById(R.id.alert1);

        alert1.setOnClickListener(view -> {
            View view1 = LayoutInflater.from(DialogActivity.this).inflate(R.layout.alert1, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
            builder.setView(view1).setIcon(R.drawable.ic_baseline_error_outline_24);
            AlertDialog dialog = builder.create();
            dialog.show();

            view1.findViewById(R.id.cancel).setOnClickListener(view2 -> dialog.dismiss());
            view1.findViewById(R.id.delete).setOnClickListener(view22 -> dialog.dismiss());

        });
    }

    private void alert2Click() {
        Button alert2 = findViewById(R.id.alert2);
        alert2.setOnClickListener(view -> {
            View view2 = LayoutInflater.from(DialogActivity.this).inflate(R.layout.alert2, null);
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
            builder.setView(view2).setIcon(R.drawable.ic_baseline_check_circle_outline_24);
            AlertDialog dialog = builder.create();
            dialog.show();

            view2.findViewById(R.id.ok).setOnClickListener(view1 -> dialog.dismiss());
        });

    }
    private void alert3Click(){
        Button alert3 = findViewById(R.id.alert3);
        alert3.setOnClickListener(view -> {
            View view3 = LayoutInflater.from(DialogActivity.this).inflate(R.layout.alert3,null);
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
            builder.setView(view3);
            AlertDialog dialog = builder.create();
            dialog.show();

            view3.findViewById(R.id.loading).setOnClickListener(view1 -> dialog.dismiss());
        });
    }

    private void alert4Click() {
        Button alert4 = findViewById(R.id.alert4);
        alert4.setOnClickListener(view -> {
            View view4 = LayoutInflater.from(DialogActivity.this).inflate(R.layout.alert4,null);
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
            builder.setView(view4).setIcon(R.drawable.ic_baseline_error_outline_24);
            AlertDialog dialog = builder.create();
            dialog.show();

            view4.findViewById(R.id.yes_delete).setOnClickListener(view1 -> dialog.dismiss());
        });
    }

}