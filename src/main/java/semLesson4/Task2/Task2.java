package semLesson4.Task2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task2 {
    private static ArrayDeque<String> dataBase = new ArrayDeque<>();
    public static void main(String[] args) {
        while (true) {
            write();
        }
    }

    private static void saveToDB(String input) {
        dataBase.push(input);
    }

    public static String getUserInput() {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    private static void write() {
        String userInput = getUserInput();
        if (userInput.equalsIgnoreCase("print")) System.out.println(dataBase);
        else if (userInput.equalsIgnoreCase("revert")) {
            dataBase.pop();
            System.out.println(dataBase);
        }
        else saveToDB(userInput);
    }
}
