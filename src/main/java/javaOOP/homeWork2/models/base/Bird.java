package javaOOP.homeWork2.models.base;

public class Bird extends Animal implements MakeSound {
    private Integer flightAltitude;

    public Bird(Integer heightOfAnimal, Integer weightOfAnimal, String eyesColor, Integer flightAltitude) {
        super(heightOfAnimal, weightOfAnimal, eyesColor);
        this.flightAltitude = flightAltitude;
    }

    public void Fly() {
        System.out.println("Flying on " + flightAltitude);
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() +
                ", flightAltitude=" + flightAltitude + "}";
    }

    @Override
    public void makeSound() {
        System.out.println("Default sound");
    }
}
