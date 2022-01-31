import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;

    public void play(Player player1, Player player2, Scanner console){
        boolean isfirstPlayerTurn;
        boolean isSecretNumberGuessed;
        byte sign;

        generateNumber();
        isfirstPlayerTurn = true;
        isSecretNumberGuessed = false;
        while (!isSecretNumberGuessed){
            if (isfirstPlayerTurn) {
                sign = playerNextStep(player1, console);
            } else {
                sign = playerNextStep(player2, console);
            }
            if (sign<0){
                System.out.println("Secret number is less then yours.");
            }  
            if (sign>0){
                System.out.println("Secret number is bigger then yours.");
            }
            isSecretNumberGuessed = (sign == 0);
            isfirstPlayerTurn = !isfirstPlayerTurn;
        }
        System.out.println("You win!"); 
    }

    private void generateNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }

    private byte checkNumber(int number) {
       // -1, если меньше, +1 если больше, 0 - если равно
       return (byte) Integer.signum(secretNumber - number); 
    }

    private byte playerNextStep (Player player, Scanner console) {
        System.out.println(player.getName()+", enter your number: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        return checkNumber(player.getNumber());
    }
}