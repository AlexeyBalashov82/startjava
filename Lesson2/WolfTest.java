public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.isMale = false;
        wolf.name = "Honey";
        wolf.weight = 10;
        wolf.age = 3;
        wolf.color = "Grey";
        System.out.println("Is this wolf a male? " + wolf.isMale);
        System.out.println("The name of this wolf is " + wolf.name);        
        System.out.println("This wolf wieghts: " + wolf.weight + " kg.");
        System.out.println("This wolf is " + wolf.age + " years old");
        System.out.println("The color of the wold is " + wolf.color);
        wolf.sit();
        wolf.walk();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}