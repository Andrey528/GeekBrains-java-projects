package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.MakeSound;
import javaOOP.homeWork2.models.base.Wild;

public class Wolf extends Wild implements MakeSound {
    private boolean head;

    public Wolf(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String habitat, String foundDate, boolean head) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, habitat, foundDate);
        this.head = head;
    }

    @Override
    public String toString() {
        return "Wolf{" + super.toString() +
                ", head=" + head + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Woo");
    }
}
