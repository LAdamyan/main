package com.example.myapplication.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;


public class FullImageFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view2 = inflater.inflate(R.layout.fragment_full_image, container, false);
       return  view2;
    }


}