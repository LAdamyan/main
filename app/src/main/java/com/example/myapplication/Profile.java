package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class Profile {

  private int profileImage;
  private String name;
  private String surName;
  private String imageURL;

  public Profile(int profileImage, String name, String surName, String imageURL) {
    this.profileImage = profileImage;
    this.name = name;
    this.surName = surName;
    this.imageURL = imageURL;
  }

  public int getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(int profileImage) {
    this.profileImage = profileImage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public static List<Profile> getProfile() {
    ArrayList<Profile> profiles = new ArrayList<>();
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/4f/a4/31/4fa4314526c2ebe20b5bd2d2f63120fc.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/72/1e/c8/721ec8a0793eb7f1f3f5e704db3cd0f0.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/79/82/f6/7982f6b391578e1e69c89a11667e89d1.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/09/46/0b/09460b3ee205cc8ee027e6c1c26196f6.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/63/50/e7/6350e781b3fc7489905e029653d5469d.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/4f/a4/31/4fa4314526c2ebe20b5bd2d2f63120fc.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/72/1e/c8/721ec8a0793eb7f1f3f5e704db3cd0f0.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/79/82/f6/7982f6b391578e1e69c89a11667e89d1.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/09/46/0b/09460b3ee205cc8ee027e6c1c26196f6.jpg"));
    profiles.add(new Profile(R.drawable.world,
            "Lilit", "Adamyan",
            "https://i.pinimg.com/236x/63/50/e7/6350e781b3fc7489905e029653d5469d.jpg"));

    return profiles;

  }


}
