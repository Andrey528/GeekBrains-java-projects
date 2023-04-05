package semLesson4.Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text:num
 * Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
 * Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Task1 {
    private static final String SEPARATOR = ":";
    private static List<String> dataBase = new LinkedList<>();
    public static void callSaveToDB() {
        while (true) {
            System.out.println("Введите строку вида text:num");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            saveToDB(input);
        }
    }

    private static void saveToDB(String input) {
        String data = input.split(SEPARATOR)[0];
        int index = Integer.parseInt(input.split(SEPARATOR)[1]);
        if (data.startsWith("print")) {
            System.out.println(dataBase.get(index));
        }
        else if (index > dataBase.size()) {
                for (int i = dataBase.size(); i < index; i++) {
                    dataBase.add(null);
                }
                dataBase.add(index, data);
        }
        else if (data.toLowerCase().startsWith("allprint")) {
            System.out.println(dataBase);
        } else dataBase.add(index, data);

    }
}
