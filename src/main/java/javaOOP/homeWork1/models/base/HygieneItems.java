package javaOOP.homeWork1.models.base;

public class HygieneItems extends Good {
    private Integer amountInPackage;

    public HygieneItems(String productName, Integer productPrice, Integer productCount, String productMeasure, Integer amountInPackage) {
        super(productName, productPrice, productCount, productMeasure);
        this.amountInPackage = amountInPackage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", amountInPackage=" + amountInPackage;
    }
}