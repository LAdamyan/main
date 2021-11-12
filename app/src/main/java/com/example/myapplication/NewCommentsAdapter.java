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

public class NewCommentsAdapter extends RecyclerView.Adapter<MySecondViewHolder> {

    public ArrayList<NewComments>newComments = new ArrayList<>();

    @NonNull
    @Override
    public MySecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycle_view2,parent,false);
        return new MySecondViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MySecondViewHolder holder, int position) {
       holder.initData(newComments.get(position));
    }

    @Override
    public int getItemCount() {
        return newComments.size();
    }
    public void setNewComments(List<NewComments> newComments){
        this.newComments.clear();
        this.newComments.addAll(newComments);
        notifyDataSetChanged();
    }


}
class MySecondViewHolder extends RecyclerView.ViewHolder{

    public MySecondViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void initData(NewComments newComments) {
        AppCompatImageView icon = itemView.findViewById(R.id.comment);
        AppCompatTextView bugComment = itemView.findViewById(R.id.bug_comment);
        AppCompatTextView testIO = itemView.findViewById(R.id.test_IO);
        AppCompatTextView bugText = itemView.findViewById(R.id.bug_text);
        AppCompatTextView product = itemView.findViewById(R.id.product);

        icon.setImageResource(newComments.getIcon());
        bugComment.setText(newComments.getBug());
        testIO.setText(newComments.getBugTest());
        bugText.setText(newComments.getBugText());
        product.setText(newComments.getProductNum());



    }
}

