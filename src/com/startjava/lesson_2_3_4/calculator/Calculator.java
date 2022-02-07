package com.startjava.lesson_2_3_4.calculator;

import static java.lang.Math.pow;

class Calculator {

    private String[] mathExpression = new String[3];

    public boolean setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression.split(" ");
        String validString = "+-*/^%";
        return validString.contains(this.mathExpression[1]);
    }

    public double calculate() {
        switch (mathExpression[1]) {
            case "+":
                return Integer.parseInt(mathExpression[0]) + Integer.parseInt(mathExpression[2]);
            case "-":
                return Integer.parseInt(mathExpression[0]) - Integer.parseInt(mathExpression[2]);
            case "*":
                return Integer.parseInt(mathExpression[0]) * Integer.parseInt(mathExpression[2]);
            case "/":
                return Integer.parseInt(mathExpression[0]) / (double) Integer.parseInt(mathExpression[2]);
            case "^":
                return pow(Integer.parseInt(mathExpression[0]), Integer.parseInt(mathExpression[2]));
            case "%":
                return Integer.parseInt(mathExpression[0]) % Integer.parseInt(mathExpression[2]);
            default:
                return 0;
        }
    }
}