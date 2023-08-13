package javaAlgorithm.hashMap;

import javaAlgorithm.hashMap.models.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();

        table.add("D", 5);
        table.add("K", 9);
        table.add("H", 1);
        table.add("C", 6);
        table.add("Q", 3);
        table.add("G", 2);
        table.add("U", 0);

        table.print();
    }
}
