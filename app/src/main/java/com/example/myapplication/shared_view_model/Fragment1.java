package com.example.myapplication.shared_view_model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;


public class Fragment1 extends Fragment {

  private SharedViewModel viewModel;
    private AppCompatEditText editText1;
    private AppCompatButton button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(getActivity()).get(SharedViewModel.class);

        editText1 = view.findViewById(R.id.fragment1_editText);
        button = view.findViewById(R.id.fragment1_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.setText(editText1.getText());

                getActivity().getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container_viewModel,new Fragment2())
                        .commit();
            }
        });

    }
}