package javaIntorduction.semLesson2.Task1;

import java.io.File;

public class Task1 {
    public static String getRepeatString(int numN) {
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numN; i++) {
        if (i % 2 != 0) sb.append("c2");
        else sb.append("c1");
    }
    return sb.toString();
//        try {
//            File file = new File("test.txt");
//            file.createNewFile();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            System.out.println("А я все равно работаю");
//        }
    }
}
