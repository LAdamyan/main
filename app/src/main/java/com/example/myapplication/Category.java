package com.example.myapplication;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int icon;
    private String title;
    private ChipGroup chipGroup;



    public Category(int icon, String title, ChipGroup chipGroup) {
        this.icon = icon;
        this.title = title;
        this.chipGroup = chipGroup;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public ChipGroup getChipGroup() {
        return chipGroup;
    }

    public static List<Category> getCategoryItems() {
        ArrayList<Category> categoryArrayList = new ArrayList<>();


        return null;
    }
}
