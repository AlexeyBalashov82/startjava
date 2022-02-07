package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String mathExpression;
        boolean isValidOperation;

        do {
            do {
                System.out.print("Enter math expression: ");
                mathExpression = console.nextLine();
                isValidOperation = calc.setMathExpression(mathExpression);
                if (!isValidOperation) {
                    System.out.println("Unknown operation!");
                }
            } while (!isValidOperation);
            System.out.println(mathExpression + " = " + calc.calculate());
        } while (isNext(console));
    }

    private static boolean isNext(Scanner console) {
        String answer;
        do {
            System.out.print("Do you want to repeat (yes/no)?: ");
            answer = console.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return (answer.equals("yes"));
    }
}