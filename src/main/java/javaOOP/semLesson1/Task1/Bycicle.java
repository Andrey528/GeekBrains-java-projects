package javaOOP.semLesson1.Task1;

public class Bycicle extends Vehicle {
    public Bycicle(String color, String model) {
        super(color, model, 2, 12, 30);
    }

    @Override
    public void drive() {
        System.out.println("Bycicle driving");
    }

    @Override
    public String toString() {
        return "Bycicle" + super.toString();
    }
}
