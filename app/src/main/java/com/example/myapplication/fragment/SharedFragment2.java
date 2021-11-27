package com.example.myapplication.fragment;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;


public class SharedFragment2 extends Fragment {

    AppCompatTextView textView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_shared2, container, false);
        textView1 = v.findViewById(R.id.shared_textview);

        loadText();
        return v;


    }

    private  void loadText() {
        if (getActivity() != null) {
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences("saved text", MODE_PRIVATE);
            String savedText = sharedPreferences.getString("saved text", "loaded text");
            textView1.setText(savedText);
        }

    }

}