package com.example.myapplication.recycleView2;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Entertainments {

    private int image ;
    private String title ;
    private String text ;
    private String place ;
    private String button ;
    private int logo;


    public Entertainments(int image, String title, String text, String place, String button,int logo) {
        this.image = image;
        this.title = title;
        this.text = text;
        this.place = place;
        this.button = button;
        this.logo = logo;
    }

    public int getImage() {
        return image;
    }

    public  int getLogo(){
        return logo;
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
                       "some of the finest Italian food in the area.\n"
                       + "We have something special to please ever..."
                           ,"Restaurants",
                           "Request",R.drawable.ic_baseline_restaurant_24));
        entertainmentsArrayList.add(new Entertainments(R.drawable.glen_eagles_golf,
                " Gleneagles Golf Club & Events",
                "Gleneagles Golf Course consists of a \n" +
                        "challenging 18-hole course,measuring over 6,500 yards from the blue trees.The Course..."
                ,"Golf and Country Clubs",
                "Request",R.drawable.ic_baseline_golf_course_24));
        entertainmentsArrayList.add(new Entertainments(R.drawable.barrington_golf_club,
                " Barrington Golf Club",
                "A challenging regulation 18 hole golf\n" +
                        "course on 180 acres.Raccoon Hill will\n"
                        + "challenge every part of your golf game wit..."
                ,"Golf and Country Clubs",
                "Request",R.drawable.ic_baseline_golf_course_24));
        entertainmentsArrayList.add(new Entertainments(R.drawable.ellswooth_golf_club,
                " Ellsworth Meadows Golf Club",
                "TEllsworth Meadows Golf Club is open to\n" +
                        "the public,located in Hudson,OH Please \n"
                        + "inquire about golf membersships.Call(330...)"
                ,"Golf and Country Clubss",
                "Request",R.drawable.ic_baseline_golf_course_24));
        entertainmentsArrayList.add(new Entertainments(R.drawable.ellswooth_golf_club,
                " Ellsworth Meadows Golf Club",
                "TEllsworth Meadows Golf Club is open to\n" +
                        "the public,located in Hudson,OH Please \n"
                        + "inquire about golf membersships.Call(330...)"
                ,"Golf and Country Clubss",
                "Request",R.drawable.ic_baseline_golf_course_24));

                          return entertainmentsArrayList;


   }


}





