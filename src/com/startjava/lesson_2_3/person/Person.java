package com.startjava.lesson_2_3.person;

public class Person {

    boolean isMale = true;
    String name = "Alex";
    double height = 1.76;
    int weight = 96;
    int age = 39;

    void sit() {
        System.out.println("Sitting");
    }

    void walk() {
        System.out.println("Walking");
    }

    void run() {
        System.out.println("Running");
    }

    String talk() {
        return "Hi, bro!";
    }

    void learnJava() {
        System.out.println("Java f*cking great!");
    }
}