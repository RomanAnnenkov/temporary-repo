package model.calculator;

import model.ComplexNumber;

public interface ICanCalculateFactory {
    CanCalculate create(ComplexNumber arg);
}
