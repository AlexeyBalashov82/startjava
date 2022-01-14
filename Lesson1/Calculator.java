public class Calculator {

    private static int firstNumber = 26;
    private static int secondNumber = 10;
    private static char action = '/';

    public static void main(String[] args) {
        if (action == '+') {
            System.out.println(firstNumber+secondNumber);
        } else if (action == '-') {
            System.out.println(firstNumber-secondNumber);
        } else if (action == '*') {
            System.out.println(firstNumber*secondNumber);            
        } else if (action == '/') {
            System.out.println(firstNumber/(double)secondNumber);            
        } else if (action == '^') {
           long power = 1;
           for (int i = 1; i <= secondNumber; i++){
             power *= firstNumber;
           } 
            System.out.println(power);
        } else if (action == '%') {
            System.out.println(firstNumber%secondNumber);            
        }
    }
}