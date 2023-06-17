package model.calculator;

import model.ComplexNumber;

public interface CanCalculate {
    void sum(ComplexNumber number);

    void multiply(ComplexNumber number);

    void subtract(ComplexNumber number);

    void divide(ComplexNumber number);

    ComplexNumber result();
}
