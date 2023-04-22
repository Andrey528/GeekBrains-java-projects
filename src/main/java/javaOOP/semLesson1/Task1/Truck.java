package javaOOP.semLesson1.Task1;

public class Truck extends Vehicle {
    public Truck(String color, String model) {
        super(color, model, 6, 8000, 160);
    }

    @Override
    public void drive() {
        System.out.println("Truck driving");
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
