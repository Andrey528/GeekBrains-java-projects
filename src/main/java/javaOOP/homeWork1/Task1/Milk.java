package javaOOP.homeWork1.Task1;

public class Milk extends Drinks {
    private Double richness;
    private String expirationDate;

    public Milk(Integer productPrice, Integer productCount, Integer capacity, Double richness, String expirationDate) {
        super("Milk", productPrice, productCount, "ml", capacity);
        this.richness = richness;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Milk{" + super.toString() +
                ", richness=" + richness +
                ", expirationDate='" + expirationDate + "\'}";
    }
}
