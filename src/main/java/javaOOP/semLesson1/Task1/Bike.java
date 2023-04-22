package javaOOP.semLesson1.Task1;

public class Bike extends Vehicle {

    public Bike(String color, String model) {
        super(color, model, 2, 600, 200);
    }

    @Override
    public void drive() {
        System.out.println("Bike driving");
    }

    @Override
    public String toString() {
        return "Bike" + super.toString();
    }
}
