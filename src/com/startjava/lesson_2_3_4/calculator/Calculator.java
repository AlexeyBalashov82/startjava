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
        int a = Integer.parseInt(mathExpression[0]);
        int b = Integer.parseInt(mathExpression[2]);

        switch (mathExpression[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return pow(a, b);
            case "%":
                return a % b;
            default:
                return 0;
        }
    }
}