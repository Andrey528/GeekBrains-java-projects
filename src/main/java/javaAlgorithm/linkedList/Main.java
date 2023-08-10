package javaAlgorithm.linkedList;

import javaAlgorithm.linkedList.models.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(9);

        list.print();
        list.revert();
        list.print();
    }
}
