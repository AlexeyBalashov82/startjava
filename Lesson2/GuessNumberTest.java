import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {      
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first player name: ");
        Player player1 = new Player(console.nextLine());
        System.out.println("Enter second player name: ");
        Player player2 = new Player(console.nextLine());

        boolean isfirstPlayerTurn;
        boolean isSecretNumberGuessed;
        byte sign;
        GuessNumber game = new GuessNumber();

        do {
            game.generateNumber();
            isfirstPlayerTurn = true;
            isSecretNumberGuessed = false;
            while (!isSecretNumberGuessed){
                if (isfirstPlayerTurn) {
                    sign = playerNextStep(player1, console, game);
                } else {
                    sign = playerNextStep(player2, console, game);
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
        } while (isNext(console));
    }

    private static byte playerNextStep (Player player, Scanner console, GuessNumber game) {
        System.out.println(player.getName()+", enter your number: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        return game.checkNumber(player.getNumber());
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