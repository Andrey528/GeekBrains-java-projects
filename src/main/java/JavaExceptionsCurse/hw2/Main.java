package JavaExceptionsCurse.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста
 * вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 *
 * Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 * Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 *
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }


    //task1
    static void task1() {
        while(true) {
            try {
                System.out.printf("Ваше число %f\n", Float.parseFloat(scanner.next()));
                break;
            }
            catch (NumberFormatException e) {
                System.out.printf("Ошибка: %s\n", e);
            }
        }
    }


    //task2
    static void task2() {
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }


    //task3
    static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    //task4
    static void task4() {
        try {
            System.out.printf("Вы ввели: %s", getUserInput());
        }
        catch (MyEmptyStringException e) {
            System.out.printf("%s\nТребуется ввести строку.\n", e.getMessage());
        }
    }

    static String getUserInput() throws MyEmptyStringException {
        String userInput = scanner.nextLine();

        if (userInput.isEmpty())
            throw new MyEmptyStringException("Пустые строки вводить нельзя.");
        return userInput;
    }
}

class MyEmptyStringException extends Exception {
    public MyEmptyStringException(String message) {
        super(message);
    }
}