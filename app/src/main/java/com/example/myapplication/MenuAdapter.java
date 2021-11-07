package com.example.myapplication;

import static com.example.myapplication.R.layout.horizontal_listing;
import static com.example.myapplication.R.layout.pizza_layout;
import static com.example.myapplication.R.layout.vertical_listing;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

public class MenuAdapter extends RecyclerView.Adapter<MyBeholder> {

    private ItemClickListener itemClickListener;

    private List<Menu> menus = Collections.emptyList();
    boolean isHorizontalList;

    public void setOnItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public MyBeholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View itemView ;
         if(isHorizontalList){
             itemView = LayoutInflater.from(parent.getContext()).inflate(horizontal_listing,null);
         }else{
             itemView =LayoutInflater.from(parent.getContext()).inflate(vertical_listing,null);
         }

        return new MyBeholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyBeholder holder, int position) {
      Menu menu = menus.get(position);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              itemClickListener.onclick(menu.getPieces());
          }
      });


     holder.initData(menu);


    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public void SetMenu(List<Menu>menus){
        this.menus.clear();
        this.menus.addAll(menus);
        notifyDataSetChanged();
    }


}


    class MyBeholder extends RecyclerView.ViewHolder{

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
            AppCompatTextView pieces = itemView.findViewById(R.id.pizza_6_pieces);
            AppCompatTextView background = itemView.findViewById(R.id.view);

            pizzaImage.setImageResource(menu.getPizzaImage());
            name.setText(menu.getPizzaName());
            type.setText(menu.getPizzaType());
            price.setText(menu.getPrice());
            amd.setText(menu.getPriceAmd());
            card.setImageResource(menu.getShopCard());
            pieces.setText(menu.getPieces());
            background.setText(menu.getBackground());



        }


    }
interface ItemClickListener{
    void onclick(String text);
}

