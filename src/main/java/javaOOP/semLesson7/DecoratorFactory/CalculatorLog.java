package javaOOP.semLesson7.DecoratorFactory;

public class CalculatorLog implements Calculable {
    private Calculable calc;
    private ILog logger;

    public CalculatorLog(Calculable calc, ILog logger) {
        this.calc = calc;
        this.logger = logger;
        logger.logIt(String.format("Первый параметр равен %d\n", calc.getResult()));
    }

    @Override
    public Calculable sum(int arg) {
        logger.logIt(String.format("Сумма с %d\n", arg));
        return calc.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.logIt(String.format("Произведение на %d\n", arg));
        return calc.multi(arg);
    }

    @Override
    public int getResult() {
        int temp = calc.getResult();
        logger.logIt(String.format("Результат %d\n", temp));
        return temp;
    }
}
