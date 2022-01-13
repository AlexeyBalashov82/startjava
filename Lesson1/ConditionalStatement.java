public class ConditionalStatement {

    private static int age = 39;
    private static boolean isMale = true;
    private static float growth = 1.76F;
    private static char firstLetteOfTheName = 'A';

    public static void main(String[] args) {
        if (age>20) {
            System.out.println("I'm older then 20");
        }

        if (isMale) {
            System.out.println("I'm a man");
        }

        if (!isMale) {
            System.out.println("I'm a woman");
        }

        if (growth<1.80) {
            System.out.println("I'm below 1.80");
        } else {
            System.out.println("I'm 1.80 at last");
        }

        if (firstLetteOfTheName == 'M') {
            System.out.println("My name starts with M");
        } else if (firstLetteOfTheName == 'I') {
            System.out.println("My name starts with I");
        } else {
            System.out.println("My name starts not from M neither from I");
        }
    }
}