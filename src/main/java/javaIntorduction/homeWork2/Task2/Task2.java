package javaIntorduction.homeWork2.Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Дана строка json:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
public class Task2 {
    public static void parseJsonString(String jsonString) {
        String[] resultRows = jsonString.replace("{", "").split("}, ");
        String[] result;
        ArrayList<String> jsonStringValues = new ArrayList<String>();

        for (Integer i = 0; i < resultRows.length; i++) {
            resultRows[i] = resultRows[i].replace("[", "").replace("]", "").replace("}", "").replace("\"", "");
            String[] resultPairs = resultRows[i].split(",");
            for (int j = 0; j < resultPairs.length; j++) {
                String[] keyAndValues = resultPairs[j].split(":");
                jsonStringValues.add(keyAndValues[1]);
            }
        }

//        for (int i = 0; i < myMap.size(); i++) {
//            for (Map.Entry<String, String> entry: myMap.entrySet()) {
//                System.out.println(entry.getKey() + ":" + entry.getValue());
//            }
//        }
        for (int i = 0; i < jsonStringValues.size(); i = i+3) {
            System.out.println("Студент " + jsonStringValues.get(i) + " получил " + jsonStringValues.get(i + 1) + " по предмету " + jsonStringValues.get(i + 2));
        }
    }
}
