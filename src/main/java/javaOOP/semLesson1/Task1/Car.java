package javaOOP.semLesson1.Task1;

public class Car extends Vehicle {

    public Car(String color, String model) {
        super(color, model, 4, 2000, 180);
    }

    @Override
    public void drive() {
        System.out.println("Car driving");
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }
}
