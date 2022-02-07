package com.startjava.lesson_2_3.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setMale(false);
        wolf.setName("Honey");
        wolf.setWeight(10);
        wolf.setAge(3);
        wolf.setColor("Grey");
        System.out.println("Is this wolf a male? " + wolf.isMale());
        System.out.println("The name of this wolf is " + wolf.getName());        
        System.out.println("This wolf wieghts: " + wolf.getWeight() + " kg.");
        System.out.println("This wolf is " + wolf.getAge() + " years old");
        System.out.println("The color of the wold is " + wolf.getColor());
    }
}