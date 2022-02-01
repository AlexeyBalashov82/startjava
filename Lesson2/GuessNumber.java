import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int secretNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
        Scanner console = new Scanner(System.in);
        Player currentPlayer = player1;

        generateNumber();
        player1.setNumber(-1);//сбрасываю значения, на случай если новый секрет совпадет с последним числом текущего игрока
        player2.setNumber(-1);

        while (currentPlayer.getNumber() != secretNumber){
            if (tryGuessNumberCurrentPlayer(currentPlayer, console)) {
                System.out.println(currentPlayer.getName() + " wins!");
            } else {
                currentPlayer = changeCurrentPlayer(currentPlayer);
            }
        }
    }

    private void generateNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }

    private boolean tryGuessNumberCurrentPlayer(Player player, Scanner console) {
        System.out.println(player.getName()+", enter your number: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        return isEqualSecretNumber(player.getNumber());
    }

    private Player changeCurrentPlayer(Player currentPlayer) {
        if (currentPlayer == player1) {
            return player2;
        } else {
            return player1;
        }
    }

    private boolean isEqualSecretNumber(int number) {
        if (secretNumber > number) {
            System.out.println("Secret number is bigger than " + number);
            return false;
        } 
        if (secretNumber < number){
            System.out.println("Secret number is less than " + number);      
            return false;          
        }
        System.out.println("Secret number is equals to " + number);
        return true;
    }

}