package javaOOP.homeWork1.models;

import javaOOP.homeWork1.models.base.Food;

public class Bread extends Food {
    private String flour;

    public Bread(Integer productPrice, Integer productCount, String expirationDate, String flour) {
        super("Bread", productPrice, productCount, "item", expirationDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return "Bread{" + super.toString() +
                ", flour='" + flour + "\'}";
    }
}
