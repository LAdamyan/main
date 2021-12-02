package com.example.myapplication.recycleView2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class FilterAdapter extends RecyclerView.Adapter<SortingItemHolder> {

    private ArrayList<Category> categories = new ArrayList<>();

    @NonNull
    @Override
    public SortingItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sorting_item_view,parent,false);
        return new SortingItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SortingItemHolder holder, int position) {
      Category category = categories.get(position);
      holder.initData(category);

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public  void setCategory(List<Category>category){
        this.categories.clear();
        this.categories.addAll(category);
        notifyDataSetChanged();
    }

}
class SortingItemHolder extends RecyclerView.ViewHolder {

    AppCompatImageView iconImage = itemView.findViewById(R.id.brush_icon);
    AppCompatTextView  titleText = itemView.findViewById(R.id.arts);
    ChipGroup chipGroup = itemView.findViewById(R.id.sorting_chipGroup);


    public SortingItemHolder(@NonNull View itemView) {
        super(itemView);
    }

    void initData(Category category){
        iconImage.setImageResource(category.getIcon());
        titleText.setText(category.getTitle());

        String []fun = {"Casinos","Art Galleries","Comedy Clubs","Move Theatres","Museums","Dance Studios"};
        for(String funPlaces : fun ){
            Chip chip = new Chip(chipGroup.getContext());
            chip.setText(funPlaces);
            chip.setCheckable(true);
            chip.setChipBackgroundColor(AppCompatResources.getColorStateList(itemView.getContext(), R.color.light_blue3));
            chipGroup.addView(chip);


        }


    }
}




