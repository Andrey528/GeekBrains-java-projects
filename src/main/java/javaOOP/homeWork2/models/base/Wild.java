package javaOOP.homeWork2.models.base;

public class Wild extends Animal implements MakeSound {
    private String habitat;
    private String foundDate;

    public Wild(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, String habitat, String foundDate) {
        super(heightOfAnimal, weightOfAnimal, eyesColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    @Override
    public String toString() {
        return "Wild{" + super.toString() +
                ", habitat='" + habitat + "\'" +
                ", foundDate='" + foundDate + "\'}";
    }


    @Override
    public void makeSound() {
        System.out.println("Default sound");
    }
}
