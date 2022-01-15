public class ConditionalStatement {

    public static void main(String[] args) {

        int age = 39;
        if (age > 20) {
            System.out.println("I'm older then 20");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("I'm a man");
        }

        if (!isMale) {
            System.out.println("I'm a woman");
        }

        float height = 1.76F;
        if (height < 1.80) {
            System.out.println("I'm below 1.80");
        } else {
            System.out.println("I'm 1.80 at last");
        }

        char firstLetterOfName = 'A';
        if (firstLetterOfName == 'M') {
            System.out.println("My name starts with M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("My name starts with I");
        } else {
            System.out.println("My name starts not from M neither from I");
        }
    }
}