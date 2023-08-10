package javaAlgorithm.doublyLinkedList;

import javaAlgorithm.doublyLinkedList.models.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList();

        list.add(5);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(8);

        list.print();
        list.revert();
        list.print();
    }
}
