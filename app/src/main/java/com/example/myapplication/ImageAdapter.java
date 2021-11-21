package com.example.myapplication;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<MyViewHolder2>{

    private ArrayList<Gallery> myUrls = new ArrayList<>();


    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.glide_recycle_items,parent,false);
        return new MyViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {
         Gallery gallery = myUrls.get(position);
         holder.initData(gallery);


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

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
    
    

}