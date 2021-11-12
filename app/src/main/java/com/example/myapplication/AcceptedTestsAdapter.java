package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AcceptedTestsAdapter extends RecyclerView.Adapter<MyTestViewHolder> {

    private ArrayList<AcceptedTests>acceptedTests = new ArrayList<>();

    @NonNull
    @Override
    public MyTestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycle_view1,parent,false);
        return new MyTestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTestViewHolder holder, int position) {
        holder.initData(acceptedTests.get(position));

    }

    @Override
    public int getItemCount() {
        return acceptedTests.size();
    }

    public void setAcceptedTests(List<AcceptedTests>acceptedTests){
        this.acceptedTests.clear();
        this.acceptedTests.addAll(acceptedTests);
        notifyDataSetChanged();
    }


}
class MyTestViewHolder extends RecyclerView.ViewHolder{

    public MyTestViewHolder(@NonNull View itemView) {

        super(itemView);
    }

    public void initData(AcceptedTests acceptedTests) {
        AppCompatImageView image = itemView.findViewById(R.id.letter1);
        AppCompatTextView userName = itemView.findViewById(R.id.text1);
        AppCompatTextView number = itemView.findViewById(R.id.text2);
        AppCompatTextView coverage = itemView.findViewById(R.id.coverage);

        image.setImageResource(acceptedTests.getImage());
        userName.setText(acceptedTests.getUserName());
        number.setText(acceptedTests.getNumber());
        coverage.setText(acceptedTests.getCoverage());
    }
}
