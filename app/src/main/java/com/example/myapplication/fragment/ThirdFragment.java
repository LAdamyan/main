package com.example.myapplication.fragment;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Permissions;
import com.example.myapplication.R;

import java.io.File;

public class ThirdFragment extends Fragment {

    private static final int STORAGE_PERMISSION_CODE = 100;


    AppCompatTextView textView;
    String result;
    AppCompatButton saveButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_third, container, false);


        textView = v.findViewById(R.id.getData);
        Bundle arguments = getArguments();
        if (arguments != null) {
            result = arguments.getString("Text");
            textView.setText(result);
        }
        saveButton = v.findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return v;



    }




}