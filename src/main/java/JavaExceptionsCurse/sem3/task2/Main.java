package JavaExceptionsCurse.sem3.task2;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
 * такого типа можно было работать в блоке try-with-resources.Нужно бросить исключение, если работа с объектом типа счетчик была не в
 * ресурсном try, и/или ресурс остался открыт. Подумайте какой тип исключения подойдет лучше всего.
 */

public class Main {
    public static void main(String[] args) {
        try (Counter counter1 = new Counter()){
            System.out.printf("Текущее значение счетчика %s \n", counter1);
            counter1.add();
            System.out.printf("Текущее значение счетчика %s \n", counter1);
            counter1.closeCounter();
            counter1.add();
        } catch (CloseCounterException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}

class Counter implements AutoCloseable{
    private int counter;
    private boolean isOpen;

    public Counter() {
        this.counter = 0;
        this.isOpen = true;
    }

    public Counter(int counter) {
        this.counter = counter;
        this.isOpen = true;
    }

    public int add() throws CloseCounterException {
        if (isOpen)
            return  ++counter;
        throw new CloseCounterException("Счетчик закрыт");
    }

    public void closeCounter() {
        this.isOpen = false;
    }

    @Override
    public String toString() {
        return "" + this.counter;
    }

    @Override
    public void close() {
        closeCounter();
    }
}

class CloseCounterException extends Exception {
    public CloseCounterException(String message) {
        super(message);
    }
}