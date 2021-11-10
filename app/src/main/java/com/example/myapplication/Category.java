package com.example.myapplication;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int icon;
    private String title;
    private ArrayList<String > chipText;




    public Category(int icon, String title) {
        this.icon = icon;
        this.title = title;

    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }



    public static List<Category> getCategoryItems() {
        ArrayList<Category> categoryArrayList = new ArrayList<>();
        categoryArrayList.add(new Category(R.drawable.brush_icon,"Arts & Entertainment"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_directions_car_filled_24,"Automotive"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_other_houses_24,"Community & Goverment"));
        categoryArrayList.add(new Category(R.drawable.brush_icon,"Arts & Entertainment"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_directions_car_filled_24,"Automotive"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_other_houses_24,"Community & Goverment"));
        categoryArrayList.add(new Category(R.drawable.brush_icon,"Arts & Entertainment"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_directions_car_filled_24,"Automotive"));
        categoryArrayList.add(new Category(R.drawable.ic_baseline_other_houses_24,"Community & Goverment"));

        return categoryArrayList;
    }
}
