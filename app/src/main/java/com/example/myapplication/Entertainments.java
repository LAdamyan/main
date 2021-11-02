package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Entertainments {

    private int image ;
    private String title ;
    private String text ;
    private String place ;
    private String button ;


    public Entertainments(int image, String title, String text, String place, String button) {
        this.image = image;
        this.title = title;
        this.text = text;
        this.place = place;
        this.button = button;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getPlace() {
        return place;
    }

    public String getButton() {
        return button;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public static List<Entertainments> getEntertainments(){
       ArrayList<Entertainments>entertainmentsArrayList = new ArrayList<>();
       entertainmentsArrayList.add(new Entertainments(R.drawable.tomasso,
                                                      " Tomasso Trattoria & Enoteca",
               "Tomasso Trattoria & Enoteca prepares\n" +
                       "some of the finest Italian food in the area.\n" + "We have something special to please ever..."
                           ,"Restaurants","Request"));
               return entertainmentsArrayList;


   }


}





