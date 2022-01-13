public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i<=20; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        int numberForWhileCycle = 6;
        while (numberForWhileCycle>=-6) {
            System.out.print(numberForWhileCycle + " ");
            numberForWhileCycle = numberForWhileCycle-2;
        }
        System.out.print("\n");
        int sum = 0;
        int numberForDoWhileCycle = 10;
        do {
            if (numberForDoWhileCycle % 2 != 0){
                sum += numberForDoWhileCycle;
            }
            numberForDoWhileCycle++;
        } while(numberForDoWhileCycle<=20);
        System.out.println(sum);
    }
}