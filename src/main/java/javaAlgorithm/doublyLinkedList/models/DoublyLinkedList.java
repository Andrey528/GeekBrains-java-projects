package javaAlgorithm.doublyLinkedList.models;

public class DoublyLinkedList<T extends Comparable<T>> {
    private Node head;
    private Node tail;

    public void add(T value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void add(T value, Node node) {
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null)
            tail = newNode;
        else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node) {
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public Node find(T value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value)
                return currentNode;
            currentNode = currentNode.next;
        }
        return null;
    }

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null)
                tail = currentNode;
            if (next == null)
                head = currentNode;
            currentNode = next;
        }
    }

    public void push(T value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public T peek() {
        T result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public void print() {
        Node currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }

    public class Node {
        T value;
        Node next;
        Node previous;

        Node() {}
        Node(T value) {
            this.value = value;
        }
    }
}
