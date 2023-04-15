package homeWork5.Task2;

import java.util.*;

/**
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task2 {

    static ArrayList<String> listOfNames = new ArrayList<>(List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
            "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Иван Иванов", "Петр Чернышов",
            "Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова",
            "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков",
            "Иван Ежов"));
    static HashMap<String, Integer> namePopularityMap = new HashMap<>();

    static LinkedHashMap<String, Integer> namePopularitySortedMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        fillMap();
    }

    private static void fillMap() {
        listOfNames.forEach(item -> {
            String name = item.split(" ")[0];
            if (namePopularityMap.containsKey(name)) namePopularityMap.put(name, namePopularityMap.get(name) + 1);
            else namePopularityMap.put(name, 1);
        });
        checkRepeatedValues();
    }

    private static void checkRepeatedValues() {
        namePopularityMap.entrySet().removeIf(entry -> entry.getValue().equals(1));
        sortMyMap(namePopularityMap);
    }

    private static void sortMyMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> tempMap = new HashMap<>();

        tempMap.putAll(map);

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            String tempForKey = entry.getKey();
            Integer tempForValue = entry.getValue();

            for (Map.Entry<String, Integer> entry1 : tempMap.entrySet())
            {
                if (tempForValue < entry1.getValue()) {
                    tempForKey = entry1.getKey();
                    tempForValue = entry1.getValue();
                }
            }

            if (!tempForKey.isEmpty()) {
                namePopularitySortedMap.put(tempForKey, tempForValue);
                tempMap.remove(tempForKey);
            }
        }

        if (tempMap.isEmpty()) printMap();
        else sortMyMap(tempMap);
    }

    private static void printMap() {
        namePopularityMap.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("---------Sorted---------");
        namePopularitySortedMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
