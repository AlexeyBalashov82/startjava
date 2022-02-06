package com.startjava.lesson_1.game;

public class MyFirstGame {

    public static void main(String[] args) {
        int secretNumber = 53;
        int userNumber = 50;
        int startRange = 1;
        int endRange = 100;
       
        while (userNumber != secretNumber) {
            if (secretNumber < userNumber) {
                System.out.println("My number is less than: " + userNumber);
                endRange = userNumber;
                userNumber -= (endRange - startRange) / 2;
            }
            if (secretNumber > userNumber) {
                System.out.println("My number is bigger than: " + userNumber);
                startRange = userNumber;
                userNumber += (endRange - startRange) / 2;               
            }           
        }
        System.out.println("Your win! Secret number is: " + userNumber);
    }
}