package homeWork4.Task1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task1 {
    private static LinkedList<String> dataBase = new LinkedList<>();
    public static void main(String[] args) {
        fillLinkedList();
        callMethods();

    }

    private static void callMethods() {
        boolean stop = false;
        while (!stop) {
            System.out.println("Выберите из меню (\"q\" - стоп): " +
                    "\n1. Перевернуть список;" +
                    "\n2. Поместить элемент в конец очереди;" +
                    "\n3. Вернуть первый элемент из очереди и удалить его;" +
                    "\n4. Вернуть первый элемент из очереди, не удаляя элемент;" +
                    "\n5. Показать список.");
            String input = getUserInput();

            switch (input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    callReverse();
                    break;
                case "2":
                    System.out.println("Введите элемент: ");
                    enqueue(getUserInput());
                    break;
                case "3":
                    dequeue();
                    break;
                case "4":
                    first();
                    break;
                case "5":
                    showList();
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    private static void showList() {
        System.out.println(dataBase);
    }

    private static void fillLinkedList() {
        boolean stop = false;
        while (!stop) {
            System.out.println("Введите элемент (\"q\" - стоп): ");
            String input = getUserInput();

            if (input.equalsIgnoreCase("q"))
            {
                stop = true;
                break;
            }

            dataBase.add(input);
        }
    }

    private static void callReverse() {
        Collections.reverse(dataBase);
        System.out.println(dataBase);
    }

    private static void enqueue(String input) {
//        enqueue() - помещает элемент в конец очереди
        dataBase.addLast(input);
    }

    private static void dequeue() {
//        dequeue() - возвращает первый элемент из очереди и удаляет его
        System.out.println(dataBase.removeFirst());
    }

    private static void first() {
//        first() - возвращает первый элемент из очереди, не удаляя.
        System.out.println(dataBase.getFirst());
    }
}
