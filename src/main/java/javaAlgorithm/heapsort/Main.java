package javaAlgorithm.heapsort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = new Random().nextInt(20);
        }
        print(array);
        sort(array);
        print(array);
    }

    public static void print(int[] array) {
        for (int i: array)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void sort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        for (int j = array.length - 1; j >= 0; j--) {
            int temp = array[0];
            array[0] = array[j];
            array[j] = temp;

            heapify(array, j, 0);
        }
    }

    public static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;

        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }
    }
}
