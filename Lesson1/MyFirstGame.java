public class MyFirstGame {

    private static int secretNumber = 49;

    public static void main(String[] args) {
        int userNumber = 50;
        int lowBorder = 0;
        int highBorder = 101;
        while (userNumber!=secretNumber){
            if (secretNumber<userNumber){
                System.out.println("My number is less than: " + userNumber);
                highBorder = userNumber;
                userNumber -= (highBorder - lowBorder)/2;
            }
            if (secretNumber>userNumber){
                System.out.println("My number is bigger than: " + userNumber);
                lowBorder = userNumber;
                userNumber += (highBorder - lowBorder)/2;               
            }           
        }
        System.out.println("Your win! Secret number is: " + userNumber);
    }
}