package model;

public class CanCalculateFactory implements ICanCalculateFactory {
    public CanCalculate create(int arg) {
        return new Calculator(arg);
    }

}
