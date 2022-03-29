package com.android.s19110317;

public class Calculator {

    public enum Operator {ADD, SUB, DIV, MUL, POW, FAC, LOG}

    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        return Math.pow(firstOperand, secondOperand);
    }

    public double fac(double firstOperand) {
        return factorial(firstOperand);
    }

    public double log(double firstOperand, double secondOperand) {
        return Math.log(firstOperand) / Math.log(secondOperand);
    }

    private double factorial(double n) {

        if (n < 0) {
            return Double.NaN;
        }

        double fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}