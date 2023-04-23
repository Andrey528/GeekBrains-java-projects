package javaOOP.homeWork1.models.base;

public abstract class Good {
    private String productName;
    private Integer productPrice;
    private Integer productCount;
    private String productMeasure;

    public Good(String productName, Integer productPrice, Integer productCount, String productMeasure) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.productMeasure = productMeasure;
    }

    @Override
    public String toString() {
        return
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productCount=" + productCount +
                ", productMeasure='" + productMeasure + '\'';
    }
}
