package javaOOP.homeWork2.models;

import javaOOP.homeWork2.models.base.MakeSound;
import javaOOP.homeWork2.models.base.Pet;

public class Dog extends Pet implements MakeSound {
    private boolean education;

    public Dog(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String nickname, String species, boolean vaccination, String coatColor, String birthday, boolean education) {
        super(heightOfAnimal, weightOfAnimal, eyesColor, nickname, species, vaccination, coatColor, birthday);
        this.education = education;
    }

    public void train() {
        System.out.println("Dog education");
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                ", education=" + education + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
