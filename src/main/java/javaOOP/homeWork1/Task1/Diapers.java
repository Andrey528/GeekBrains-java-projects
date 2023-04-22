package javaOOP.homeWork1.Task1;

public class Diapers extends ChildrensGoods {
    private String size;
    private Integer minWidth;
    private Integer maxWidth;
    private String type;

    public Diapers(Integer productPrice, Integer productCount, Integer minAge, Boolean hypoallergenic, String size, Integer minWidth, Integer maxWidth, String type) {
        super("Diapers", productPrice, productCount, "item", minAge, hypoallergenic);
        this.size = size;
        this.minWidth = minWidth;
        this.maxWidth = maxWidth;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Diapers{" + super.toString() +
                ", size='" + size + "\'" +
                ", minWidth=" + minWidth +
                ", maxWidth='" + maxWidth +
                ", type='" + type + "\'}";
    }
}
