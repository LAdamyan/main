package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuHorizontalAdapter extends RecyclerView.Adapter<MenuItemHolder> {

    private ArrayList<MenuHorizontal> menuHorizontals = new ArrayList<>();


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

        holder.initData(menuHorizontal);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            boolean isClicked = false;

            @Override
            public void onClick(View view) {
                if (!isClicked) {
                    holder.pieceTextView.setBackgroundColor(ContextCompat.getColor(holder.pieceTextView.getContext(), R.color.light_red));
                    isClicked = true;
                } else {
                    holder.pieceTextView.setBackgroundColor(ContextCompat.getColor(holder.pieceTextView.getContext(), R.color.grey));
                    isClicked = false;
                }
            }
        });
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

}
interface ItemClickListener{
    void click(String name,int id);


}
