import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {      
        Scanner console = new Scanner(System.in);
        System.out.println("Enter first player name: ");
        Player player1 = new Player(console.nextLine());
        System.out.println("Enter second player name: ");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1,player2);

        do {
            game.play(); 
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