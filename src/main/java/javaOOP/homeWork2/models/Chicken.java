package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.Bird;
import javaOOP.homeWork2.models.base.MakeSound;

public class Chicken extends Bird implements MakeSound {
    public Chicken(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, Integer flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, flightAltitude);
    }

    @Override
    public String toString() {
        return "Chicken{" + super.toString() + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Ko");
    }
}
