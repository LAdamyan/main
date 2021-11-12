package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.AcceptedTestsAdapter;
import com.example.myapplication.Entertainments;
import com.example.myapplication.NewCommentsAdapter;
import com.example.myapplication.R;


public class FirstFragment extends Fragment {

    public AcceptedTestsAdapter acceptedTestsAdapter = new AcceptedTestsAdapter();
    public NewCommentsAdapter newCommentsAdapter = new NewCommentsAdapter();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

    }







}