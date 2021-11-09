package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilterAdapter extends RecyclerView.Adapter<SortingItemHolder> {

    @NonNull
    @Override
    public SortingItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sorting_item_view,parent,false);
        return new SortingItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SortingItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
class SortingItemHolder extends RecyclerView.ViewHolder {

    public SortingItemHolder(@NonNull View itemView) {
        super(itemView);
    }
}




