import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String mathOperation; 
        boolean isValidOperation;

        do {
            System.out.print("Enter first number: ");
            firstNumber = console.nextInt();
            console.nextLine();
            calc.setFirstNumber(firstNumber);
            do {
                System.out.print("Enter math operation: ");
                mathOperation = console.nextLine();  
                isValidOperation = calc.setMathOperation(mathOperation);
                if (!isValidOperation){
                    System.out.println("Unknown operation!");
                }
            } while (!isValidOperation);
            System.out.print("Enter second number: ");
            secondNumber = console.nextInt();
            console.nextLine();
            calc.setSecondNumber(secondNumber);
            System.out.println(firstNumber + mathOperation + secondNumber + " = " + calc.calculate());
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