package com.example.myapplication.fragment;

import static android.content.Context.MODE_PRIVATE;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;


public class SharedFragment1 extends Fragment {

    AppCompatEditText editText;
    AppCompatButton button;
    AppCompatButton button2;
    AppCompatTextView textView;
    final String SAVED_TEXT= "saved text";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shared1, container, false);
        editText= view.findViewById(R.id.shared_textview);
        button = view.findViewById(R.id.shared_button);
        button.setOnClickListener(view1 -> saveText());


        button2 = view.findViewById(R.id.shared_data_button);
        button2.setOnClickListener(view12 -> {
            SharedFragment2 sharedFragment2 = new SharedFragment2();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.shared_fragment_container,sharedFragment2);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();




        });
        return view;
    }

    private void saveText() {
        if (getActivity() != null) {
            SharedPreferences sharedPreferences = getActivity().getSharedPreferences(SAVED_TEXT, MODE_PRIVATE);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(SAVED_TEXT, "text");
            edit.apply();
        }

    }




}