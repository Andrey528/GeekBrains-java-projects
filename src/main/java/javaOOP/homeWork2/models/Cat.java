package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.MakeSound;
import javaOOP.homeWork2.models.base.Pet;

public class Cat extends Pet implements MakeSound {
    private boolean wool;

    public Cat(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String nickname, String species, boolean vaccination, String coatColor, String birthday, boolean wool) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, nickname, species, vaccination, coatColor, birthday);
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                ", wool=" + wool + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
