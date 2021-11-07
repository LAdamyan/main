package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MenuHorizontal {


    private String pieces;


    public MenuHorizontal(String pieces) {
        this.pieces = pieces;

    }

    public String getPieces() {
        return pieces;
    }

    public static List<MenuHorizontal> getMenuItems() {
        ArrayList<MenuHorizontal> menuHorizontalArrayList = new ArrayList<>();
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces"));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 6 pieces"));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces"));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 6 pieces"));
        menuHorizontalArrayList.add(new MenuHorizontal("Pizza 12 pieces"));

        return menuHorizontalArrayList;
    }
}