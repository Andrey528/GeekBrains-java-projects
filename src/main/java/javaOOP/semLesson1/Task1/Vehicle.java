package javaOOP.semLesson1.Task1;

public abstract class Vehicle {
    private String color;
    private String model;
    private Integer countOfWheel;
    private Integer weight;
    private Integer speed;

    public Vehicle(String color, String model, Integer countOfWheel, Integer weight, Integer speed) {
        this.color = color;
        this.model = model;
        this.countOfWheel = countOfWheel;
        this.weight = weight;
        this.speed = speed;
    }

    public void drive() {}

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", countOfWheel=" + countOfWheel +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
