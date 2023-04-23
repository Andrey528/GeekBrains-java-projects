package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.MakeSound;
import javaOOP.homeWork2.models.base.Wild;

public class Tiger extends Wild implements MakeSound {
    public Tiger(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String habitat, String foundDate) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, habitat, foundDate);
    }

    @Override
    public String toString() {
        return "Tiger{" + super.toString() + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Rrrrr");
    }
}
