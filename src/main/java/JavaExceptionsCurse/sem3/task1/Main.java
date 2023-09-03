package JavaExceptionsCurse.sem3.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для пользователя сообщение
 * об ошибке.
 * 2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. Исключение должно
 * отображать понятное для пользователя сообщение об ошибке
 * 3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. Исключение должно отображать понятное для
 * пользователя сообщение об ошибке.
 */

public class Main {
    public static void main(String[] args) {
//        try {
//            task1();
//        } catch (DivisionByZeroException e) {
//            System.out.println(e.getMessage());
//        }

//        task2(new String[]{"1", "2", "3", null, "5"}, 3);
//        try {
//            task3("./test.txt");
//        } catch (MyFileNotFoundException e) {
//            System.out.printf("%s : %s", e.getMessage(), e.getFileName());
//        }
    }

    static void task1() {
        try {
            int a = 9 / 0;
        } catch (ArithmeticException e) {
            throw new DivisionByZeroException("Ошибка! Деление на 0");
        }
    }

    static void task11() {
        try {
            int b = 0;
            if (b == 0) {
                throw new DivisionByZeroException("Ошибка! Деление на 0");
            }
            int a = 9 / b;
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    static void task2(String[] arr, int index) {
        try{
            if (arr[index] == null)
                throw new NullElementArrayException("Элемент не проинициализирован", index);
        } catch (NullElementArrayException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getIndex());
        }
    }

    static void task3(String fileName) throws MyFileNotFoundException {
        try (FileReader fileReader = new FileReader(fileName)) {
            char[] buf = new char[10];
            fileReader.read(buf);
            System.out.println(buf);
        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("Файл не найден", fileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String messege) {
        super(messege);
    }
}


class NullElementArrayException extends RuntimeException{
    private  int index;

    public NullElementArrayException(String message, int index) {
        super(message);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}

class MyFileNotFoundException extends Exception {
    private String fileName;

    public MyFileNotFoundException(String message, String fileName) {
        super(message);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}