package javaIntorduction.homeWork1.Task3;

import java.util.ArrayList;

public class Task3 {
    static ArrayList<Integer> result = new ArrayList<Integer>();
    public static ArrayList<Integer> findSimpleNums(int num) {
//Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1 и на само себя (1 - это не простое число);
        if (num == 1) return result;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return findSimpleNums(num - 1);
        }
        result.add(num);
        return findSimpleNums(num - 1);
    }
}
