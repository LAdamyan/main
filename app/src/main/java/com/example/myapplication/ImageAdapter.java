package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.fragment.FullImageFragment;
import com.example.myapplication.fragment.GalleryFragment;
import com.example.myapplication.fragment.ThirdFragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class ImageAdapter extends RecyclerView.Adapter<MyViewHolder2>{

    private ArrayList<Gallery> myUrls = new ArrayList<>();
    private onItemClickListener onItemClickListener;


    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.glide_recycle_items,parent,false);
        return new MyViewHolder2(view);
    }

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
         Gallery gallery = myUrls.get(position);
         holder.initData(gallery);
         holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               onItemClickListener.onClick(gallery.getImageUrl());
           }
       });

    }

    @Override
    public int getItemCount() {
        return myUrls.size();
    }
    public void setMyUrls(List<Gallery>imageList){
        this.myUrls.clear();
        this.myUrls.addAll(imageList);
        notifyDataSetChanged();
    }


}

class MyViewHolder2 extends RecyclerView.ViewHolder{

    AppCompatImageView imageUrl;

    public MyViewHolder2(@NonNull View itemView) {
        super(itemView);
        imageUrl = itemView.findViewById(R.id.image_url);


    }
    void initData(Gallery image) {

        Glide.with(itemView)
                .load(image.getImageUrl())
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .centerCrop()
                .into(imageUrl);

    }

}
