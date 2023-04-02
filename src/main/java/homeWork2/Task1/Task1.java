package homeWork2.Task1;
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//(через FileWriter).
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    public static ArrayList<Integer> genArray(int length) {
        ArrayList<Integer> result = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < length; i++) {
            result.add((int) Math.round(Math.random() * 10));
        }
        return result;
    }

    private static boolean writeLog(String arg) {
        try (FileWriter in = new FileWriter("test.txt", true)) {
            in.append(arg);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public static void bubbleSort(ArrayList<Integer> array) {
        boolean isSorted = false;
        System.out.println(array.toString());
        while (!isSorted) {
            isSorted = true;
            writeLog(array.toString() + "\n");
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i + 1) < array.get(i))
                {
                    Collections.swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            System.out.println(array.toString());
        }
    }
}
