package com.example.myapplication.firstApp;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import de.hdodenhof.circleimageview.CircleImageView;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageHolder> {

     private final ArrayList<HomePageProfile> homePageProfiles = new ArrayList<>();
     private onItemClickListener2 onItemClickListener2;



     public void setItemClickListener2(onItemClickListener2 onItemClickListener2){
         this.onItemClickListener2 = onItemClickListener2;
     }
    @NonNull
    @Override
    public HomePageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_recycle_item,parent,false);
        return new HomePageHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull HomePageHolder holder, int position) {

        HomePageProfile homePageProfile = homePageProfiles.get(position);
        holder.initData(homePageProfile);
        holder.itemView.setOnClickListener(view -> {
            onItemClickListener2.click(homePageProfile.getName(), homePageProfile.getSurName());
        });


    }

    @Override
    public int getItemCount() {
        return homePageProfiles.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setProfiles(List<HomePageProfile> homePageProfile){
        this.homePageProfiles.clear();
        this.homePageProfiles.addAll(homePageProfile);
        notifyDataSetChanged();
    }



}
class HomePageHolder extends RecyclerView.ViewHolder {

    private  int LIKE_STATUS= 0;

    CircleImageView circleImageView = itemView.findViewById(R.id.profile_image_page);
    AppCompatTextView name = itemView.findViewById(R.id.profile_name_page);
    AppCompatTextView surName = itemView.findViewById(R.id.profile_surName_page);
    AppCompatImageView imageview = itemView.findViewById(R.id.page_image);
    AppCompatImageView likeImage = itemView.findViewById(R.id.heart_icon);


    public HomePageHolder(@NonNull View itemView) {
        super(itemView);
    }


    public void initData(HomePageProfile homePageProfile) {

        circleImageView.setImageResource(homePageProfile.getProfileImage());
        name.setText(homePageProfile.getName());
        surName.setText(homePageProfile.getSurName());
        Glide.with(itemView.getContext())
                .load(homePageProfile.getImageURL())
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .centerCrop()
                .into(imageview);
        likeImage.setOnClickListener(view -> {
            if( LIKE_STATUS== 0){ // like is off, turn it on
                likeImage.setColorFilter(Color.parseColor("#C8CDF2"));
                LIKE_STATUS = 1;
            }

            else if(LIKE_STATUS == 1){ // like  is on, turn it off
                likeImage.setColorFilter(Color.parseColor("#8797EF"));
                LIKE_STATUS = 0;
            }


        });


    }

}
interface onItemClickListener2{
    void click(String name,String surname);
}
