package javaOOP.homeWork1.models;

import javaOOP.homeWork1.models.base.ChildrensGoods;

public class Pacifier extends ChildrensGoods {
    public Pacifier(Integer productPrice, Integer productCount, Integer minAge, Boolean hypoallergenic) {
        super("Pacifier", productPrice, productCount, "item", minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Pacifier{" + super.toString() + "}";
    }
}
