public class Wolf extends Object {

    public boolean isMale;
    public String name;
    public int weight;
    public int age;
    public String color;

    public Wolf(boolean isMale, String name, int weight, int age, String color) {
        this.isMale = isMale;
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public void sit() {
        System.out.println("Sitting");
    }

    public void walk() {
        System.out.println("Walking");
    }

    public void run() {
        System.out.println("Running");
    }

    public void howl() {
        System.out.println("Woooooo...");
    }

    public void hunt() {
        System.out.println("Om-nom-nom");
    }
}