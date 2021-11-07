package com.example.myapplication;

import static com.example.myapplication.R.layout.horizontal_listing;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class MenuVerticalAdapter extends RecyclerView.Adapter<MyBeholder> {

    private List<Menu> menu = Collections.emptyList();


    @Override
    public MyBeholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(horizontal_listing, null);
        return new MyBeholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBeholder holder, int position) {
        holder.initData(menu.get(position));


    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public void SetMenu(List<Menu> menu) {
        this.menu = menu;
    }

}

class MyBeholder extends RecyclerView.ViewHolder {

    public MyBeholder(@NonNull View itemView) {
        super(itemView);
    }

    void initData(Menu menu) {

        AppCompatImageView pizzaImage = itemView.findViewById(R.id.pizza_meat);
        AppCompatTextView name = itemView.findViewById(R.id.pizza_assort);
        AppCompatTextView type = itemView.findViewById(R.id.medium);
            AppCompatTextView price = itemView.findViewById(R.id.price);
            AppCompatTextView amd = itemView.findViewById(R.id.amd2);
            AppCompatImageView card = itemView.findViewById(R.id.shop_card);

            pizzaImage.setImageResource(menu.getPizzaImage());
            name.setText(menu.getPizzaName());
            type.setText(menu.getPizzaType());
            price.setText(menu.getPrice());
            amd.setText(menu.getPriceAmd());
            card.setImageResource(menu.getShopCard());

        }

    }

