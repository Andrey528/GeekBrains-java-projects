package homeWork1.Task1;

import java.util.Scanner;

public class Task1 {
    static int countSum(int num) {
        if (num == 1) return 1;
        return num + countSum(num-1);
    }
    public static void sumOfNums() {
//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        System.out.println("Сумма = " + countSum(num));
    }
}
