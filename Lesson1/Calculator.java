public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 26;
        int secondNumber = 10;
        char mathOperation = '/';

        if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);            
        } else if (mathOperation == '/') {
            System.out.println(firstNumber / (double) secondNumber);            
        } else if (mathOperation == '^') {
           long power = 1;
           for (int i = 1; i <= secondNumber; i++) {
               power *= firstNumber;
           } 
            System.out.println(power);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);            
        }
    }
}