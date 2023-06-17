package model.calculator;

import model.ComplexNumber;

public class CanCalculateFactory implements ICanCalculateFactory {
    public CanCalculate create(ComplexNumber arg) {
        return new Calculator(arg);
    }

}
