package javaOOP.homeWork1.models.base;

public class Drinks extends Good {
    private Integer capacity;

    public Drinks(String productName, Integer productPrice, Integer productCount, String productMeasure, Integer capacity) {
        super(productName, productPrice, productCount, productMeasure);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", capacity=" + capacity;
    }
}
