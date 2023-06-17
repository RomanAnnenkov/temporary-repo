package model.logger;

import model.calculator.CanCalculate;
import model.ComplexNumber;
import model.calculator.ICanCalculateFactory;

public class LogCanCalculateFactory implements ICanCalculateFactory {

    Logger logger;

    public LogCanCalculateFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public CanCalculate create(ComplexNumber arg) {
        return new LogCalculator(arg, logger);
    }
}
