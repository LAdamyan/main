package com.example.myapplication;

import static com.example.myapplication.R.color.light_red;
import static com.example.myapplication.R.layout.abc_action_bar_up_container;
import static com.example.myapplication.R.layout.horizontal_listing;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class MenuHorizontalAdapter extends RecyclerView.Adapter<MenuItemHolder> {

    private List<MenuHorizontal> menuHorizontals = Collections.emptyList();

    private ItemClickListener itemClickListener;


    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;

    }

    @NonNull
    @Override
    public MenuItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_listing, parent,false);
        return new MenuItemHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemHolder holder, int position) {
        MenuHorizontal menuHorizontal = menuHorizontals.get(position);

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

        holder.initData(menuHorizontal);
    }


    @Override
    public int getItemCount() {
        return menuHorizontals.size();
    }

    public void setMenuHorizontal(List<MenuHorizontal> menu) {
        this.menuHorizontals.clear();
        this.menuHorizontals.addAll(menu);
        notifyDataSetChanged();
    }

}

class MenuItemHolder extends RecyclerView.ViewHolder {

    AppCompatTextView pieceTextView = itemView.findViewById(R.id.pizza_6_pieces);

    public MenuItemHolder(@NonNull View itemView) {
        super(itemView);
    }

    void initData(MenuHorizontal menu) {
        pieceTextView.setText(menu.getPiece());


    }
    interface ItemClickListener{
        void click(String name,int id);


    }
}


