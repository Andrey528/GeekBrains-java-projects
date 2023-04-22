package javaIntorduction.homeWork5.Task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов
 */
public class Task1 {

    static HashMap<List<String>, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        showUserInterface();
    }

    private static void showUserInterface() {
        boolean stop = false;
        while (!stop) {
            String input = getUserInput("Выберите из меню (\"q\" - стоп): " +
                    "\n1. Добавить в телефонную книгу;" +
                    "\n2. Показать телефонную книгу.");

            switch (input) {
                case "q":
                    stop = true;
                    break;
                case "1":
                    ArrayList<String> userNumbersArray = new ArrayList<>();
                    List<String> userNameArray = Arrays.stream(getUserInput("ФИО абонента, разделяя через /").split("/"))
                            .map(item -> firstUpperCase(item.toLowerCase())).collect(Collectors.toList());
                    Collections.addAll(userNumbersArray, getUserInput("Введите известные номера абонента через /").split("/"));
                    fillMap(userNameArray, userNumbersArray);
                    break;
                case "2":
                    printMap();
                    break;
                default:
                    System.out.println("Нет такого варианта)");
                    break;
            }
        }
    }

    private static String getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    public static String firstUpperCase(String word){
        if(word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static void fillMap(List<String> key, ArrayList<String> value) {
        if (!phoneBook.containsKey(key)) {
            phoneBook.put(key, value);
            System.out.println("Абонент успешно добавлен");
        }
        else System.out.println("Такой абонент уже есть в книге");
    }

    private static void printMap() {
        phoneBook.forEach((key, value) -> {
            System.out.print("Абонент: ");
            key.forEach(item -> System.out.print(item + " "));
            System.out.println("Известные номера: ");
            value.forEach(item -> System.out.print(item + " | "));
        });
    }
}
