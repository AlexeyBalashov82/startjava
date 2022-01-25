public class Wolf {

    private boolean sex; // true - male, false - female
    private String name;
    private int weight;
    private int age;
    private String color;

    public boolean isMale() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>8){
            System.out.println("This wolf is seemed to be dead");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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