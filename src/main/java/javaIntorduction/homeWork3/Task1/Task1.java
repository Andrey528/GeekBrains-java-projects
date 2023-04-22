package javaIntorduction.homeWork3.Task1;
//Реализовать алгоритм сортировки слиянием
import java.util.ArrayList;

public class Task1 {
    private static ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
        if (array.size() == 1 || array.size() == 0) return array;

        int pivot = array.size() / 2;
        ArrayList<Integer> leftArray = new ArrayList<Integer>();
        ArrayList<Integer> rightArray = new ArrayList<Integer>();

        for (int i = 0; i < array.size(); i++) {
            if (i < pivot) leftArray.add(array.get(i));
            else rightArray.add(array.get(i));
        }

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        ArrayList<Integer> result = new ArrayList<Integer>();

        while (leftArray.size() > 0 && rightArray.size() > 0) {
            if (leftArray.get(0) <= rightArray.get(0)) {
                result.add(leftArray.get(0));
                leftArray.remove(0);
            }
            else {
                result.add(rightArray.get(0));
                rightArray.remove(0);
            }
        }

        while (leftArray.size() > 0) {
                result.add(leftArray.get(0));
                leftArray.remove(0);
        }

        while (rightArray.size() > 0) {
            result.add(rightArray.get(0));
            rightArray.remove(0);
        }

        array = result;

        return array;
    }

    public static void splitSort(ArrayList<Integer> array) {
        System.out.println(array);
        System.out.println(mergeSort(array));
    }
}
