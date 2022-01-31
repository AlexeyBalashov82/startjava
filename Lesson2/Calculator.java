public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String mathOperation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public boolean setMathOperation(String mathOperation) {
        String validString = "+-*/^%";
        this.mathOperation = mathOperation;
        return validString.contains(mathOperation);
    }

    public double calculate() {
        switch (mathOperation) {
            case "+": return firstNumber + secondNumber;
            case "-": return firstNumber - secondNumber;
            case "*": return firstNumber * secondNumber;
            case "/": return firstNumber / (double) secondNumber;
            case "^": return pow();
            case "%": return firstNumber % secondNumber;
            default: return 0;
        }
    }

    private long pow() {
        long power = 1;
        for (int i = 1; i <= secondNumber; i++) {
             power *= firstNumber;
        }   
        return power;
    }    
}