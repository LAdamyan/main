package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int pizzaImage;
    private String pizzaName;
    private String pizzaType;
    private String price;
    private String priceAmd;
    private int shopCard;

    public Menu(int pizzaImage, String pizzaName, String pizzaType, String price, String priceAmd, int shopCard) {
        this.pizzaImage = pizzaImage;
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.price = price;
        this.priceAmd = priceAmd;
        this.shopCard = shopCard;

    }

    public int getPizzaImage() {
        return pizzaImage;
    }


    public String getPizzaName() {
        return pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public String getPrice() {
        return price;
    }

    public String getPriceAmd() {
        return priceAmd;
    }

    public int getShopCard() {
        return shopCard;
    }


       public static List<Menu> getMenuItems(){
           ArrayList<Menu>menuArrayList = new ArrayList<>();
           menuArrayList.add(new Menu(R.drawable.pizza_meat_assortment, " Pizza meat assorted ",
                   " medium", "4000", "AMD", R.drawable.ic_baseline_add_shopping_cart_24));
           menuArrayList.add(new Menu(R.drawable.pizza_carpaccio, " Pizza Carpaccio with ",
                   "  plum medium", "3900", "AMD", R.drawable.ic_baseline_add_shopping_cart_24));
           menuArrayList.add(new Menu(R.drawable.pizza_piquant, " Pizza Piquant ",
                   "  plum medium", "3800", "AMD", R.drawable.ic_baseline_add_shopping_cart_24));
           menuArrayList.add(new Menu(R.drawable.pizza_vegeterian, " Pizza Vegeterian ",
                   "  plum medium", "3300", "AMD", R.drawable.ic_baseline_add_shopping_cart_24));
           menuArrayList.add(new Menu(R.drawable.pizza_vegeterian, " Pizza Vegeterian ",
                   "  plum medium", "3300", "AMD", R.drawable.ic_baseline_add_shopping_cart_24));
           menuArrayList.add(new Menu(R.drawable.pizza_piquant, " Pizza Piquant ",
                   "  plum medium", "3800", "AMD", R.drawable.ic_baseline_add_shopping_cart_24
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_carpaccio, " Pizza Carpaccio with ",
                   "  plum medium", "3900", "AMD", R.drawable.ic_baseline_add_shopping_cart_24

           ));
           return menuArrayList;

       }


}
