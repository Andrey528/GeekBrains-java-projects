package javaOOP.semLesson7.DecoratorFactory;

public class CalculableFactoryLog implements ICalculableFactory {
    private ILog logger;
    private ICalculableFactory cF;

    public CalculableFactoryLog(ILog logger, ICalculableFactory cF) {
        this.logger = logger;
        this.cF = cF;
    }

    @Override
    public Calculable create(int primaryArg) {
        Calculable temp = cF.create(primaryArg);
        return new CalculatorLog(temp, logger);
    }
}
