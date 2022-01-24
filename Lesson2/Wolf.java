public class Wolf {

    boolean isMale;
    String name;
    int weight;
    int age;
    String color;

    public Wolf(boolean isMale, String name, int weight, int age, String color) {
        this.isMale = isMale;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    void sit() {
        System.out.println("Sitting");
    }

    void walk() {
        System.out.println("Walking");
    }

    void run() {
        System.out.println("Running");
    }

    void howl() {
        System.out.println("Woooooo...");
    }

    void hunt() {
        System.out.println("Om-nom-nom");
    }
}