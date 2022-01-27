import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String mathOperation; 

        do {
            System.out.print("Enter first number: ");
            firstNumber = Integer.parseInt(console.nextLine());
            calc.setFirstNumber(firstNumber);
            mathOperation = "";
            do {
                System.out.print("Enter math operation: ");
                mathOperation = console.nextLine();  
            } while (!calc.isValidOperation(mathOperation));
            System.out.print("Enter second number: ");
            secondNumber = Integer.parseInt(console.nextLine());
            calc.setSecondNumber(secondNumber);
            System.out.println(firstNumber + mathOperation + secondNumber + " = " + calc.calculate(mathOperation));
        } while (isNext(console));
    }

    private static boolean isNext(Scanner console) {
        String answer = "";
        do {
            System.out.print("Do you want to repeat (yes/no)?: ");
            answer = console.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return (answer.equals("yes"));
    }
}