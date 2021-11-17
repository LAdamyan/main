package com.example.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.AcceptedTests;
import com.example.myapplication.AcceptedTestsAdapter;
import com.example.myapplication.R;

public class FourthFragment extends Fragment {

    public AcceptedTestsAdapter acceptedTestsAdapter = new AcceptedTestsAdapter();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.fragment_recycleView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(acceptedTestsAdapter);
        acceptedTestsAdapter.setAcceptedTests(AcceptedTests.getAcceptedTests());

        return view;
    }
}
