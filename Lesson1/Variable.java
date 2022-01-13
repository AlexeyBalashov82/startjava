public class Variable {

    private static byte  cpuCount = 4;
    private static short ramVolume = 32;
    private static int diskVolume = 12345;
    private static long salaryAim = 1234567890;
    private static float salaryCurrent = 123.45F;
    private static double batteryCharge = 98.765432;
    private static char firstLetteOfMyName = 'A';
    private static boolean isIAmJavaProgrammer = false;

    public static void main(String[] args) {
        System.out.println("My CPU number: " + cpuCount);
        System.out.println("My RAM volume: " + ramVolume);
        System.out.println("My disk volume: " + diskVolume);
        System.out.println("Salary I dream about: " + salaryAim);
        System.out.println("My current salary: " + salaryCurrent);
        System.out.println("The state of my battery charge: " + batteryCharge);
        System.out.println("My name starts from: " + firstLetteOfMyName);
        System.out.println("Do I think I am already a java programmer? " + isIAmJavaProgrammer);
    }
}