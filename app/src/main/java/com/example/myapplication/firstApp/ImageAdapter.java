package com.example.myapplication.firstApp;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<MyViewHolder2>{

    private final ArrayList<Gallery> myUrls = new ArrayList<>();


    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.glide_recycle_items,parent,false);
        return new MyViewHolder2(view);
    }

    public void setOnItemClickListener() {
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        Gallery gallery = myUrls.get(position);
        holder.initData(gallery);

        holder.imageUrl.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("imageUrl", gallery.getImageUrl());
            FullImageFragment fullImageFragment = new FullImageFragment();
            fullImageFragment.setArguments(bundle);
            AppCompatActivity activity = (AppCompatActivity) view.getContext();
            FragmentManager fragmentManager = activity.getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.activity4_fragment_container, fullImageFragment);
            fragmentTransaction.commit();

        });
    }

    @Override
    public int getItemCount() {
        return myUrls.size();
    }
    @SuppressLint("NotifyDataSetChanged")
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
