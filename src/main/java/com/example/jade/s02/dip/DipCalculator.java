package com.example.jade.s02.dip;

public class DipCalculator {
    private Operation operation;

    public DipCalculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double left, double right) {
        return operation.operate(left, right);
    }
}
