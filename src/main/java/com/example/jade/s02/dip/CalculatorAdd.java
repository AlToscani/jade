package com.example.jade.s02.dip;

public class CalculatorAdd implements Calculator {
    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
