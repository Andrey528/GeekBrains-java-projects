package javaIntorduction.homeWork1.Task2;

import java.util.Scanner;

public class Task2 {
    static int factorial(int arg) {
        if (arg == 1) return 1;
        return arg * factorial(arg - 1);
    }

    public static void callFactorial() {
//n! (произведение чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Факториал числа = " + factorial(num));
    }
}
