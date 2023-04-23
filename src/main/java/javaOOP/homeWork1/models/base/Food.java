package javaOOP.homeWork1.models.base;

public class Food extends Good {
    private String expirationDate;

    public Food(String productName, Integer productPrice, Integer productCount, String productMeasure, String expirationDate) {
        super(productName, productPrice, productCount, productMeasure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", expirationDate='" + expirationDate + '\'';
    }
}
