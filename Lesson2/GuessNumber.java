import java.util.Random;

public class GuessNumber {

    private int secretNumber;

    public void generateNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }

    public byte checkNumber(int number) {
       // -1, если меньше, +1 если больше, 0 - если равно
       return (byte) Integer.signum(secretNumber - number); 
    }
}