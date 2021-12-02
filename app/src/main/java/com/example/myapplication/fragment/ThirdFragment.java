package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.R;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ThirdFragment extends Fragment {


    AppCompatTextView textView;
    String result;
    AppCompatButton saveButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_third, container, false);

        textView = v.findViewById(R.id.getData);
        Bundle arguments = getArguments();
        if (arguments != null) {
            result = arguments.getString("Text");
            textView.setText(result);
        }

        saveButton = v.findViewById(R.id.permButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               saveTextToFile(result);
            }
        });
        return v;


    }
    private void saveTextToFile(String filename) {

        try {
            FileWriter myWriter = new FileWriter("filename.java");
            myWriter.write(result);
            myWriter.close();
            Toast.makeText(getContext(),"Saved",Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
              e.printStackTrace();
            Toast.makeText(getContext(),"Saved",Toast.LENGTH_LONG).show();
        }catch (IOException e){
            e.printStackTrace();
            Toast.makeText(getContext(),"Error saving",Toast.LENGTH_LONG).show();
    }


    }


    }





