package javaOOP.homeWork4.views;

import javaOOP.homeWork4.views.base.IView;
import javaOOP.homeWork4.views.base.ReadUserInput;

import java.util.Scanner;

public class ConsoleView implements IView, ReadUserInput {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void showMenu(){
        showMessage("""
                Выберите из меню ("0" - стоп):\s
                1. Вставка в массив;
                2. Удаление элемента по индексу;
                3. Удаление всех элементов с заданным значением;
                4. Поиск минимума;
                5. Поиск максимума;
                6. Поиск суммы элементов массива;
                7. Поиск произведения элементов массива;
                8. Поиск индекса заданного элемента в массиве;
                9. Проверка наличия элемента в массиве;
                10. Пузырьковая сортировка;
                11. Сортировка простыми вставками;
                12. Сортировка простым выбором;
                13. Получение элемента массива по индексу;
                14. Задание значения элементу массива с заданным индексом;
                15. Печать массива на экран;
                16. Длинна массива.""");
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    public double readDouble() {
        return scanner.nextDouble();
    }

    @Override
    public Object readTypeOptions() {
        showMessage("""
                Choose from menu ("0" - to stop):
                1. Integer element;
                2. Double element.""");

        int chosenOption = readInt();
        Object userInputElement;

        switch (chosenOption) {
            case 1 -> {
                showMessage("Enter Integer value:");
                userInputElement = readInt();
                return userInputElement;
            }
            case 2 -> {
                showMessage("Enter Double value:");
                userInputElement = readDouble();
                return userInputElement;
            }
            default -> {
                showMessage("Error: incorrect option");
                return null;
            }
        }
    }
}
