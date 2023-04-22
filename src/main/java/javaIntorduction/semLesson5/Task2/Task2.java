package javaIntorduction.semLesson5.Task2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 */
public class Task2 {
    static Stack<Character> characters = new Stack<>();

    public static void main(String[] args) {
        System.out.println(isValid(")afb"));
    }

    public static void fillStack(Character symbol) {
        characters.push(symbol);
    }

    public static void fillMap(Map<Character, Character> map) {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
    }

    public static boolean isValid(String arg) {
        Map<Character, Character> map = new HashMap<>();
        fillMap(map);
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arg.length(); i++) {
            if (map.containsKey(arg.charAt(i))) stack.push(arg.charAt(i));
            if (map.containsValue(arg.charAt(i))) {
                Character key = getKey(map, arg.charAt(i));
                if (key != stack.pop()) return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }

    public static Character getKey(Map<Character, Character> map, Character value) {
        for (Map.Entry<Character, Character> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) return entry.getKey();
        }
        return null;
    }
}
