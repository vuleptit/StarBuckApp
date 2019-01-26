package com.ptit.starbuckapp;

public class Drink {
    private String name;
    private String discr;
    private int imageId;

    //list of the drinks is an array
    public static final Drink drinkList[] = {new Drink("Capuchino", "This is capuchino", R.drawable.capuchino),
            new Drink("Latte", "This is latte", R.drawable.latte),
            new Drink("Starbucks Coffee", "this is coffee of starbucks", R.drawable.coffee_starbuck)};

    public Drink(String name, String discr, int imageId) {
        this.name = name;
        this.discr = discr;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDiscr() {
        return discr;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
