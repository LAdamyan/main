package com.example.myapplication.firstApp;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import java.util.ArrayList;
import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<MyViewHolder2>{

    private final ArrayList<Gallery> myUrls = new ArrayList<>();
    private onItemClickListener onItemClickListener;


    public void setOnItemClickListener(onItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_recycle_items,parent,false);
        return new MyViewHolder2(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
        Gallery gallery = myUrls.get(position);
        holder.imageUrl.setOnClickListener(view -> {
           onItemClickListener.click(gallery.getImageUrl());

        });
        holder.initData(gallery);
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
       interface onItemClickListener {
           void click(String imageUrl);

}
