public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber (int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber (int secondNumber) {
        this.secondNumber = secondNumber;
    }

    private int add() {
        return firstNumber + secondNumber;
    }

    private int subtract() {
        return firstNumber - secondNumber;
    } 

    private int multiply() {
        return firstNumber * secondNumber;
    }

    private double divide() {
        return firstNumber / (double) secondNumber;
    }

    private long pow() {
        long power = 1;
        for (int i = 1; i <= secondNumber; i++) {
             power *= firstNumber;
        }   
        return power;
    }

    private int reminder() {
        return firstNumber % secondNumber;
    }

    public String calculate(String mathOperation) {
        String result;
        switch (mathOperation) {
        case "+": result = String.valueOf(add());
            break;
        case "-": result = String.valueOf(subtract());
            break;
        case "*": result = String.valueOf(multiply());
            break;
        case "/": result = String.valueOf(divide());
            break;
        case "^": result = String.valueOf(pow());
            break;
        case "%": result = String.valueOf(reminder());
            break;
        default: result = "Unknown operation!";
            break;
        }
       return result; 
    }
}