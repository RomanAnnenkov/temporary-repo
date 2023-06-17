package model.logger;

import model.Calculator;
import model.CanCalculate;

public class LogCalculator implements CanCalculate {

    Calculator calculator;
    Logger logger;

    public LogCalculator(int arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.log("first argument - " + arg);
    }

    @Override
    public void sum(int number) {
        logger.log("sum " + number);
        calculator.sum(number);
    }

    @Override
    public void multiply(int number) {
        logger.log("multiply " + number);
        calculator.multiply(number);
    }

    @Override
    public void divide(int number) {
        logger.log("divide " + number);
        calculator.divide(number);
    }

    @Override
    public int result() {
        int result = calculator.result();
        logger.log("Result - " + result);
        return result;
    }
}
