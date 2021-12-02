package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddPhotoBottomDialogFragment extends BottomSheetDialogFragment {

    AppCompatTextView camera;
    AppCompatTextView gallery;
    AppCompatTextView remove;

    public static AddPhotoBottomDialogFragment newInstance() {
        return new AddPhotoBottomDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.bottom_sheet_layout,container,false);
       camera.findViewById(R.id.add_photo);
       gallery.findViewById(R.id.gallery);
       remove.findViewById(R.id.remove);
       return view;
    }
}
