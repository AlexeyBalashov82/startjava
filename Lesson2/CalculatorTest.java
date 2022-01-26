import java.util.Scanner;

public class CalculatorTest {

    private static boolean isRepeatable(Scanner console) {
        String REPEATQUESTION = "Do you want to repeat (yes/no)?: ";
        String answer = "";
        do {
            System.out.print(REPEATQUESTION);
            answer = console.nextLine();
        } while ((!answer.equals("yes"))&&(!answer.equals("no")));
        return (answer.equals("yes"));
    }

    public static void main(String[] args) {
        String ENTERFIRSTNUMBER = "Enter first number: ";
        String ENTERSECONDNUMBER = "Enter second number: ";
        String ENTEROPERATION = "Enter math operation: ";

        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String mathOperation; 

        do {
            System.out.print(ENTERFIRSTNUMBER);
            firstNumber = Integer.parseInt(console.nextLine());
            calc.setFirstNumber(firstNumber);
            System.out.print(ENTEROPERATION);
            mathOperation = console.nextLine();          
            System.out.print(ENTERSECONDNUMBER);
            secondNumber = Integer.parseInt(console.nextLine());
            calc.setSecondNumber(secondNumber);

            System.out.println(firstNumber+mathOperation+secondNumber+" = "+ calc.calculate(mathOperation));
        } while (isRepeatable(console));

    }
}