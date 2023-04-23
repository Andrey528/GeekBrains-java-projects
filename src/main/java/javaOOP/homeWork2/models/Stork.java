package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.Bird;
import javaOOP.homeWork2.models.base.MakeSound;

public class Stork extends Bird implements MakeSound {
    public Stork(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, Integer flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, flightAltitude);
    }

    @Override
    public String toString() {
        return "Stork{" + super.toString() + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Kuku");
    }
}