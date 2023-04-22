package javaIntorduction.homeWork3.Task2;

import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {
    public static void deleteFromArray(ArrayList<Integer> args) {
        System.out.println(args);
        int arraySize = args.size();
        int i = 0;

        while (i < arraySize) {
            if (args.get(i) % 2 == 0) {
                args.remove(i);
                arraySize--;
            }
            else {
                 i++;
            }
        }

        System.out.println(args);
    }
}
