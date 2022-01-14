public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 39;
        boolean isMale = true;
        float growth = 1.76F;
        char firstLetteOfName = 'A';

        if (age > 20) {
            System.out.println("I'm older then 20");
        }

        if (isMale) {
            System.out.println("I'm a man");
        }

        if (!isMale) {
            System.out.println("I'm a woman");
        }

        if (growth < 1.80) {
            System.out.println("I'm below 1.80");
        } else {
            System.out.println("I'm 1.80 at last");
        }

        if (firstLetteOfName == 'M') {
            System.out.println("My name starts with M");
        } else if (firstLetteOfName == 'I') {
            System.out.println("My name starts with I");
        } else {
            System.out.println("My name starts not from M neither from I");
        }
    }
}