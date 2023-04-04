package semLesson3.Task1;
//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void sorting(ArrayList arg) {
        System.out.println(arg);
        Collections.sort(arg);
        System.out.println(arg);
    }
}
