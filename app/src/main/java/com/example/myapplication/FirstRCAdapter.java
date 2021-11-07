package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FirstRCAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private ArrayList<Entertainments> entertainments = new ArrayList<>();


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item,parent,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     holder.initData(entertainments.get(position));
    }

    @Override
    public int getItemCount() {
        return entertainments.size();
    }

    public void SetEntertainments(List<Entertainments>entertainments){
        this.entertainments.clear();
        this.entertainments.addAll(entertainments);
        notifyDataSetChanged();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void initData(Entertainments entertainments) {

        AppCompatImageView imageView = itemView.findViewById(R.id.image1);
        AppCompatImageView imageView2 = itemView.findViewById(R.id.logo);
        AppCompatTextView textViewName = itemView.findViewById(R.id.textView_name);
        AppCompatTextView textViewText = itemView.findViewById(R.id.textView_text);
        AppCompatTextView textViewPlace = itemView.findViewById(R.id.restaurant);
        AppCompatButton buttonRequest = itemView.findViewById(R.id.request1);


        imageView.setImageResource(entertainments.getImage());
        imageView2.setImageResource(entertainments.getLogo());
        textViewName.setText(entertainments.getTitle());
        textViewText.setText(entertainments.getText());
        textViewPlace.setText(entertainments.getPlace());
        buttonRequest.setText(entertainments.getButton());
    }
}

