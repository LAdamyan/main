package com.example.myapplication.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.myapplication.Gallery;
import com.example.myapplication.R;

import java.util.ArrayList;


public class FullImageFragment extends Fragment {

    AppCompatImageView imageView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =   inflater.inflate(R.layout.fragment_full_image, container, false);
        imageView = view.findViewById(R.id.full_image);
        loadFullImage();
        return  view;

    }

    void loadFullImage() {

        if (getActivity() != null) {
            Glide.with(getActivity())
                    .load(Gallery.getGlideImages())
                    .placeholder(R.drawable.loading)
                    .error(R.drawable.error)
                    .centerCrop()
                    .into(imageView);

        }

    }
}