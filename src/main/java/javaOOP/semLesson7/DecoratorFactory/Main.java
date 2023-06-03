package javaOOP.semLesson7.DecoratorFactory;

// Создать логирование операций, для класса Calculator. Класс Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        ILog logger = new LogConsole();
        ICalculableFactory factory = new CalculableFactoryLog(logger, calculableFactory);
        ViewCalculator view = new ViewCalculator(factory);
        view.run();
    }
}
