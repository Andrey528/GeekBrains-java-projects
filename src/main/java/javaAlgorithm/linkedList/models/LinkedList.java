package javaAlgorithm.linkedList.models;

public class LinkedList<T extends Comparable<T>> {
    private Node root;
    private int size;

    public void add(T value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    public boolean remove(T value) {
        if (root == null)
            return false;
        if (root.value.compareTo(value) == 0) {
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value.compareTo(value) == 0) {
                currentNode.next = currentNode.next.next;
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean removeAt(int index) {
        if (index < 0 || index >= size)
            return false;
        if (index == 0) {
            root = root.next;
            size--;
            return true;
        }
        Node prev = this.getNode(index - 1);
        prev.next = prev.next.next;
        size--;
        return true;
    }

    public void removeAllWithValue(T value) {
        if (root == null)
            return;
        while (root != null && root.value.compareTo(value) == 0) {
            root = root.next;
            size --;
        }
        if (root == null)
            return;
        Node currentNode = root;
        while (currentNode.next != null) {
            if (currentNode.next.value.compareTo(value) == 0) {
                currentNode.next = currentNode.next.next;
                size--;
            } else
                currentNode = currentNode.next;
        }
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    public void setValue(T value, int index) {
        if (index < 0 || index >= size)
            return;
        this.getNode(index).value = value;
    }

    public T getValue(int index) {
        return this.getNode(index).value;
    }

    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= size || index2 < 0 || index2 >= size)
            return;
        if (index1 == index2)
            return;
        Node currentNode = root;
        Node node1 = null;
        Node node2 = null;
        for (int i = 0; currentNode != null ; i++) {
            if (index1 == i)
                node1 = currentNode;
            else if (index2 == i)
                node2 = currentNode;
            if (node2 != null && node1 != null)
                break;
            currentNode = currentNode.next;
        }
        T temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    public void quickSort() {
        quickSort(0, size - 1);
    }

    private void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        T pivot = this.getValue((leftBorder + rightBorder) / 2);
        while (leftMarker <= rightMarker) {
            while (this.getValue(leftMarker).compareTo(pivot) < 0)
                leftMarker++;
            while (this.getValue(rightMarker).compareTo(pivot) > 0)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                swap(leftMarker, rightMarker);
                leftMarker++;
                rightMarker--;
            }
            if (leftMarker < rightBorder)
                quickSort(leftMarker, rightBorder);
            if (leftBorder < rightMarker)
                quickSort(leftBorder, rightMarker);
        }
    }

    public void revert() {
        if (root != null && root.next != null)
            revert(root.next, root);
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null)
            root = currentNode;
        else
            revert(currentNode.next, currentNode);
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void push(T value) {
        Node node = new Node(value);
        node.next = root;
        root = node;
    }

    public T pop() {
        T result = null;
        if (root != null) {
            result = root.value;
            root = root.next;
        }
        return result;
    }

    public void print() {
        Node currentNode = root;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("] size: " + size);
    }

    public int size() {
        return size;
    }

    private class Node {
        T value;
        Node next;

        Node() {}

        Node (T value) {
            this.value = value;
        }
    }
}
