public class MyFirstGame {

    public static void main(String[] args) {
        int secretNumber = 49;
        int userNumber = 50;
        int lowRangeLimit = 1;
        int highRangeLimit = 100;

        while (userNumber != secretNumber) {
            if (secretNumber <= userNumber) {
                System.out.println("My number is less than: " + userNumber);
                highRangeLimit = userNumber;
                userNumber -= (highRangeLimit - lowRangeLimit) / 2;
            }
            if (secretNumber >= userNumber) {
                System.out.println("My number is bigger than: " + userNumber);
                lowRangeLimit = userNumber;
                userNumber += (highRangeLimit - lowRangeLimit) / 2;               
            }           
        }
        System.out.println("Your win! Secret number is: " + userNumber);
    }
}