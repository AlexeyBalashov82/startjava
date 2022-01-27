public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public boolean isValidOperation(String mathOperation) {
        String validString = "+-*/^%";
        if (!validString.contains(mathOperation)){
            System.out.println("Unknown operation!");
        }
        return validString.contains(mathOperation);
    }

    private long pow() {
        long power = 1;
        for (int i = 1; i <= secondNumber; i++) {
             power *= firstNumber;
        }   
        return power;
    }

    public double calculate(String mathOperation) {
        double result;
        switch (mathOperation) {
        case "+": result = firstNumber + secondNumber;
            break;
        case "-": result = firstNumber - secondNumber;
            break;
        case "*": result = firstNumber * secondNumber;
            break;
        case "/": result = firstNumber / (double) secondNumber;
            break;
        case "^": result = pow();
            break;
        case "%": result = firstNumber % secondNumber;
            break;
        default: result = 0;
            break;
        }
       return result; 
    }
}