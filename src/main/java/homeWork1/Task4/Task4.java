package homeWork1.Task4;

import java.util.Scanner;

public class Task4 {
    static Scanner scanner = new Scanner(System.in);
    public static void calc() {
//Реализовать простой калькулятор
        System.out.println("Введите выражение (операции / * - +): ");
        String userInput = scanner.next().replace(" ", "");
        Double answer = 0D;
        if (userInput.contains("+")) {
            for (String item: userInput.split("\\+")) {
                answer += Double.parseDouble(item);
            }
        }
        else if (userInput.contains("-")) {
            String[] temp = userInput.split("-");
            for (Integer i = 0; i < temp.length - 1; i++) {
                answer += Double.parseDouble(temp[i]) - Double.parseDouble(temp[i+1]);
            }
        }
        else if (userInput.contains("*")) {
            String[] temp = userInput.split("\\*");
            for (Integer i = 0; i < temp.length - 1; i++) {
                answer += Double.parseDouble(temp[i]) * Double.parseDouble(temp[i+1]);
            }
        }
        else if (userInput.contains("/")) {
            String[] temp = userInput.split("/");
            for (Integer i = 0; i < temp.length - 1; i++) {
                answer += Double.parseDouble(temp[i]) / Double.parseDouble(temp[i+1]);
            }
        }

        System.out.println(answer);
    }
}
