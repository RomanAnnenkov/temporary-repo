package model;

public class Calculator implements CanCalculate {
    private int arg;

    public Calculator(int arg) {
        this.arg = arg;
    }

    public void sum(int number) {
        arg += number;
    }

    public void multiply(int number) {
        arg *= number;
    }

    public void divide(int number) {
        arg /= number;
    }

    public int result() {
        return arg;
    }
}
