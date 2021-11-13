package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.AcceptedTests;
import com.example.myapplication.AcceptedTestsAdapter;
import com.example.myapplication.NewComments;
import com.example.myapplication.NewCommentsAdapter;
import com.example.myapplication.R;


public class FirstFragment extends Fragment {

    public AcceptedTestsAdapter acceptedTestsAdapter = new AcceptedTestsAdapter();
    public NewCommentsAdapter newCommentsAdapter = new NewCommentsAdapter();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.fragment_recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(acceptedTestsAdapter);
        acceptedTestsAdapter.setAcceptedTests(AcceptedTests.getAcceptedTests());

        RecyclerView recyclerView2 = view.findViewById(R.id.fragment_recycleView2);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView2.setAdapter(newCommentsAdapter);
        newCommentsAdapter.setNewComments(NewComments.getNewComments());

        return view;


    }



}