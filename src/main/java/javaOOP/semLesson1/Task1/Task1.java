package javaOOP.semLesson1.Task1;

import java.util.Arrays;

/**
 * Реализовать следующий набор классов, при этом должна быть выделена их иерархия:
 * 1. Транспортное средство
 * 2. Автомобиль
 * 3. Мотоцикл
 * 4. Грузовик
 * 5. Велосипед
 * Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость, а так же метод ехать.
 * В классе Program реализовать метод, который будет работать с любым наследником класса ровно так же как и с родителем,
 * то есть показать значение всех его публичных свойств и вызвать метод ехать.
 */
public class Task1 {
    public static void main(String[] args) {
        Vehicle[] transport = {
                new Car("Black", "Lada"),
                new Truck("Red", "Kamaz"),
                new Bike("Gray", "Ural"),
                new Bycicle("Blue", "Digma")
        };

        Arrays.stream(transport).forEach(item -> printObject(item));
    }

    private static void printObject(Vehicle transport) {
        System.out.println(transport.toString());
        transport.drive();
    }
}
