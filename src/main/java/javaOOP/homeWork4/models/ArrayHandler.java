package javaOOP.homeWork4.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class ArrayHandler<T> extends ArrayList {
    private List<Object> list;
    private Integer length;

    public ArrayHandler() {
        this.list = new ArrayList<Object>();
        this.length = list.size();
    }

    public ArrayHandler(List<Object> list) {
        this.list = list;
        this.length = list.size();
    }

    public Integer getLength() {
        return length;
    }

    @Override
    public boolean add(Object o) {
        boolean result = list.add(o);
        length = list.size();
        return result;
    }

    @Override
    public Object set(int index, Object element) {
        if (0 <= index && index < length) {
            list.set(index, element);
            return "Success";
        }
        else return "Unable to add element";
    }


    public String deleteElement(Integer index){
        if (length != 0 && 0 <= index && index < length) {
            list.remove((int) index);
            length = list.size();
            return "Success";
        }
        else return "Fail to remove element";
    }

    public String deleteAllElementsWithValue(Object value) {
        while (list.remove(value));
        length = list.size();
        return "Success";
    }

    public String printElement (Integer index) {
        if (length != 0 && 0 <= index && index < length) return list.get(index).toString();
        else return "Can't find element by input index";
    }

    public List<String> printAllElements () {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= length; i++) {
            result.add(i + ") " + printElement(i - 1));
        }
        return result;
    }

    public boolean checkContainsValue(Object value) {
        return list.contains(value);
    }

    public int findIndexofContainsValue(Object value) {
        int index = list.indexOf(value);

        return index;
    }

    public OptionalDouble findMinInList() {
        return list.stream().mapToDouble(v -> ((Number) v).doubleValue()).min();
    }

    public OptionalDouble findMaxInList() {
        return list.stream().mapToDouble(v -> ((Number) v).doubleValue()).max();
    }

    public double findSumElInList() {
        return list.stream().mapToDouble(v -> ((Number) v).doubleValue()).sum();
    }

    public double findOpElInList() {
        return list.stream().mapToDouble(v -> ((Number) v).doubleValue()).reduce(1, (a, b) -> a * b);
    }

    public void bubbleSort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (((Number) list.get(j)).doubleValue() > ((Number) list.get(j + 1)).doubleValue())
                    Collections.swap(list, j, j + 1);
            }
        }
    }

    public void insertionSort() {
        int j;
        Object key;

        for (int i = 1; i < length; i++) {
            key = list.get(i);
            j = i - 1;

            while (j >= 0 && ((Number) list.get(j)).doubleValue() > ((Number) key).doubleValue())
            {
                list.set(j + 1, list.get(j));
                j -= 1;
            }

            list.set(j + 1, key);
        }
    }

    public void selectionSort() {
        int index;

        for (int i = 0; i < length - 1; i++) {
            index = i;

            for (int j = i + 1; j < length; j++) {
                if (((Number) list.get(j)).doubleValue() < ((Number) list.get(index)).doubleValue())
                    index = j;
            }

            Collections.swap(list, index, i);
        }
    }
}
