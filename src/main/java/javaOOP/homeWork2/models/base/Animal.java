package javaOOP.homeWork2.models.base;

public abstract class Animal {
    private Integer heightOfAnimal;
    private Integer weightOfAnimal;
    private String eyesColor;

    protected Animal(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor) {
        this.heightOfAnimal = heightOfAnimal;
        this.weightOfAnimal = weightOfAnimal;
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return
                "heightOfAnimal=" + heightOfAnimal +
                ", weightOfAnimal=" + weightOfAnimal +
                ", eyesColor='" + eyesColor + '\'';
    }
}
