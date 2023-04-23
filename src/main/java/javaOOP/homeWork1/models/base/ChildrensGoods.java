package javaOOP.homeWork1.models.base;

public class ChildrensGoods extends Good {
    private Integer minAge;
    private Boolean hypoallergenic;

    public ChildrensGoods(String productName, Integer productPrice, Integer productCount, String productMeasure, Integer minAge, Boolean hypoallergenic) {
        super(productName, productPrice, productCount, productMeasure);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", minAge=" + minAge +
                ", hypoallergenic=" + hypoallergenic;
    }
}
