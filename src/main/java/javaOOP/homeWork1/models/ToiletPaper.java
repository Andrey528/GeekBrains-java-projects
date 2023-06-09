package javaOOP.homeWork1.models;

import javaOOP.homeWork1.models.base.HygieneItems;

public class ToiletPaper extends HygieneItems {
    private Integer denseAmount;

    public ToiletPaper(Integer productPrice, Integer productCount, Integer amountInPackage, Integer denseAmount) {
        super("Toilet Paper", productPrice, productCount, "roll", amountInPackage);
        this.denseAmount = denseAmount;
    }

    @Override
    public String toString() {
        return "ToiletPaper{" + super.toString() +
                ", denseAmount=" + denseAmount + "}";
    }
}
