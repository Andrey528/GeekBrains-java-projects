package javaOOP.semLesson7.DecoratorFactory;

public class LogConsole implements ILog {
    @Override
    public void logIt(String message) {
        System.out.println(message);
    }
}
