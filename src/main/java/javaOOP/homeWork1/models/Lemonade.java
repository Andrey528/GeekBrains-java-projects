package javaOOP.homeWork1.models;

import javaOOP.homeWork1.models.base.Drinks;

public class Lemonade extends Drinks {
    public Lemonade(Integer productPrice, Integer productCount, Integer capacity) {
        super("Lemonade", productPrice, productCount, "l", capacity);
    }


    @Override
    public String toString() {
        return "Lemonade{" + super.toString() + "}";
    }
}
