package model.logger;

import model.CanCalculate;
import model.ICanCalculateFactory;

public class LogCanCalculateFactory implements ICanCalculateFactory {

    Logger logger;

    public LogCanCalculateFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public CanCalculate create(int arg) {
        return new LogCalculator(arg, logger);
    }
}
