package homeWork5.Task3;

import java.util.*;

/**
 * Не обязательно. Написать метод, который переводит число из римского формата записи в арабский.
 */
public class Task3 {

    static HashMap<String, Integer> romanToArabicMap = new HashMap<>();
    static Stack<String> characters = new Stack<>();
    public static void main(String[] args) {
        fillMap();
        String input = getUserInput("Введите римское число:").toUpperCase();
        convert(input);
    }

    public static void fillMap() {
        romanToArabicMap.put("I", 1);
        romanToArabicMap.put("V", 5);
        romanToArabicMap.put("X", 10);
        romanToArabicMap.put("L", 50);
        romanToArabicMap.put("C", 100);
        romanToArabicMap.put("D", 500);
        romanToArabicMap.put("M", 1000);
    }

    private static String getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }

    public static void convert(String romanNum) {
        String[] letters = romanNum.split("");
        for (String letter : letters) {
            characters.add(letter);
        }

        Integer acc = 0;

        while (!characters.isEmpty()){
            Integer num = romanToArabicMap.get(characters.pop());

            if ((!characters.isEmpty()) && (num > romanToArabicMap.get(characters.peek()))) {
                acc += num - romanToArabicMap.get(characters.pop());
            }
            else acc += num;
        }

        System.out.println(acc);
    }
}
