package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MenuHorizontal {


    private String piece;
    private  int id;

    public MenuHorizontal(String piece, int id) {
        this.piece = piece;
        this.id = id;
    }


    public String getPiece() {
        return piece;
    }

    public int getId() {
        return id;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<MenuHorizontal> getMenuItems() {
        ArrayList<MenuHorizontal> menuHorizontalArrayList = new ArrayList<>();
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces",0));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 6 pieces",1));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces",2));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 6 pieces",3));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces",4));

        return menuHorizontalArrayList;
    }
}
