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
    private String pieces;
    private String background;

    public Menu(int pizzaImage, String pizzaName, String pizzaType, String price, String priceAmd, int shopCard, String pieces, String background) {
        this.pizzaImage = pizzaImage;
        this.pizzaName = pizzaName;
        this.pizzaType = pizzaType;
        this.price = price;
        this.priceAmd = priceAmd;
        this.shopCard = shopCard;
        this.pieces = pieces;
        this.background = background;
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

    public String getPieces() {
        return pieces;
    }

    public String getBackground() {
        return background;
    }
       public static List<Menu> getMenuItems(){
           ArrayList<Menu>menuArrayList = new ArrayList<>();
           menuArrayList.add(new Menu(R.drawable.pizza_meat_assortment, " Pizza meat assorted ",
                   " medium","4000","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
                   ));
           menuArrayList.add(new Menu(R.drawable.pizza_carpaccio, " Pizza Carpaccio with ",
                   "  plum medium","3900","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_piquant, " Pizza Piquant ",
                   "  plum medium","3800","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_vegeterian, " Pizza Vegeterian ",
                   "  plum medium","3300","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_vegeterian, " Pizza Vegeterian ",
                   "  plum medium","3300","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_piquant, " Pizza Piquant ",
                   "  plum medium","3800","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           menuArrayList.add(new Menu(R.drawable.pizza_carpaccio, " Pizza Carpaccio with ",
                   "  plum medium","3900","AMD",R.drawable.ic_baseline_add_shopping_cart_24,
                   "Pizza 6 pieces","view"
           ));
           return menuArrayList;

       }


}
