package com.example.myapplication;

import static com.example.myapplication.R.layout.horizontal_listing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class MenuHorizontalAdapter extends RecyclerView.Adapter<MenuItemHolder> {

    private List<MenuHorizontal> menuHorizontals = Collections.emptyList();

    @NonNull
    @Override
    public MenuItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(horizontal_listing, null);
        return new MenuItemHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemHolder holder, int position) {
        holder.initData(menuHorizontals.get(position));
    }


    @Override
    public int getItemCount() {
        return menuHorizontals.size();
    }

    public void SetMenuHorizontal(List<MenuHorizontal> menu) {
        this.menuHorizontals = menu;
    }

}

class MenuItemHolder extends RecyclerView.ViewHolder {

    public MenuItemHolder(@NonNull View itemView) {
        super(itemView);
    }

    void initData(MenuHorizontal menu) {

        AppCompatTextView pieces = itemView.findViewById(R.id.pizza_6_pieces);
        pieces.setText(menu.getPieces());


    }
}