package homeWork3.Task3;

import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3 {
    public static void findQuartels(ArrayList<Integer> args) {
        System.out.println(args);
        int acc = 0;
        ArrayList<Object> quartels = new ArrayList<>();
        quartels.add(args.get(0));
        quartels.add(args.get(0));

        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) < (Integer) quartels.get(0)) quartels.set(0, args.get(i));
            if (args.get(i) > (Integer) quartels.get(1)) quartels.set(1, args.get(i));
            acc += args.get(i);
        }

        Double avg = (double) acc / args.size();

        quartels.add(avg);

        System.out.println(quartels);
    }
}
