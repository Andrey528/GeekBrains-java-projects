package javaIntorduction.semLesson3.Task2;

import scala.collection.immutable.List;
//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
import java.util.ArrayList;

public class Task2 {
    public static void countingPlanets() {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
//        planets.add("Pluto");
        planets.add("Venus");
        planets.add("Venus");
        planets.add("Mars");

        ArrayList<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < planets.size(); i++) {
            if (!res.contains(planets.get(i))) {
                res.add(planets.get(i));
                int count = 0;
                for (String planet : planets) {
                    if (planet.equals(planets.get(i))) count++;
                }
                sb.append(planets.get(i)).append(" : ").append(count).append("\n");
            }

        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
