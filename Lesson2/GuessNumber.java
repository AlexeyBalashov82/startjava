import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
        Scanner console = new Scanner(System.in);
        Player currentPlayer = player1;

        init();

        while (true) {
            if (makeMove(currentPlayer, console)) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            } 
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private void init() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        //сбрасываю значения, на случай если новый секрет совпадет с последним числом текущего игрока
        player1.setNumber(-1);
        player2.setNumber(-1);        
    }

    private boolean makeMove(Player player, Scanner console) {
        System.out.println(player.getName()+", enter your number: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        return isEqualSecretNumber(player.getNumber());
    }

    private boolean isEqualSecretNumber(int number) {
        if (secretNumber > number) {
            System.out.println("Secret number is bigger than " + number);
        } else if (secretNumber < number) {
            System.out.println("Secret number is less than " + number);             
        } else if (secretNumber == number) {
           System.out.println("Secret number is equals to " + number);
           return true;
        }
        return false;
    }
}