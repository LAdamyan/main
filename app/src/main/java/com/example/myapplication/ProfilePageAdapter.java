package com.example.myapplication;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.fragment.GalleryFragment;
import com.example.myapplication.fragment.ProfileFragment;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfilePageAdapter extends RecyclerView.Adapter<ProfileHolder> {

     private ArrayList<Profile>profiles = new ArrayList<>();
    private onItemClickListener2 onItemClickListener2;

    @NonNull
    @Override
    public ProfileHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_recycle_item,parent,false);
        return new ProfileHolder(view);
    }
    public void setOnItemClickListener2(onItemClickListener2 onItemClickListener2){
        this.onItemClickListener2 = onItemClickListener2;
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileHolder holder, int position) {

        Profile profile = profiles.get(position);
        holder.initData(profile);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    public void setProfiles(List<Profile>profile){
        this.profiles.clear();
        this.profiles.addAll(profile);
        notifyDataSetChanged();
    }



}
class ProfileHolder extends RecyclerView.ViewHolder {

    private  int LIKE_STATUS= 0;

    CircleImageView circleImageView = itemView.findViewById(R.id.profile_image_page);
    AppCompatTextView name = itemView.findViewById(R.id.profile_name_page);
    AppCompatTextView surName = itemView.findViewById(R.id.profile_surName_page);
    AppCompatImageView imageview = itemView.findViewById(R.id.page_image);
    AppCompatImageView likeImage = itemView.findViewById(R.id.heart_icon);


    public ProfileHolder(@NonNull View itemView) {
        super(itemView);
    }


    public void initData(Profile profile) {

        circleImageView.setImageResource(profile.getProfileImage());
        name.setText(profile.getName());
        surName.setText(profile.getSurName());
        Glide.with(itemView.getContext())
                .load(profile.getImageURL())
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .centerCrop()
                .into(imageview);
        likeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( LIKE_STATUS== 0){ // like is off, turn it on
                    likeImage.setColorFilter(Color.parseColor("#C8CDF2"));
                    LIKE_STATUS = 1;
                }

                else if(LIKE_STATUS == 1){ // like  is on, turn it off
                    likeImage.setColorFilter(Color.parseColor("#8797EF"));
                    LIKE_STATUS = 0;
                }


            }
        });


    }

}
