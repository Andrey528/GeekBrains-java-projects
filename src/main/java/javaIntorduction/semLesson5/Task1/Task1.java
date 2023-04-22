package javaIntorduction.semLesson5.Task1;

import scala.collection.concurrent.Map;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
 * повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
 * буква может не меняться, а остаться такой же. (Например, note - code)
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(isIsomorth("abb", "baa"));
    }

    public static boolean isIsomorth (String a, String b) {
        LinkedHashMap<Character, Character> pair = new LinkedHashMap<>();
        Set<Character> usedValues = new HashSet<>();

        if (a.length() != b.length()) return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (pair.containsKey(a.charAt(i))) {
                    if (pair.get(a.charAt(i)) != b.charAt(i)) return false;
                }
                else {
                    if (usedValues.contains(b.charAt(i))) return false;
                    pair.put(a.charAt(i), b.charAt(i));
                    usedValues.add(b.charAt(i));
                };
            }
        }
        return true;
    }
}
