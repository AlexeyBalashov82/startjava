package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {

    private int secretNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
        System.out.println("Each player have 10 attempts!");
        Scanner console = new Scanner(System.in);
        Player currentPlayer = player1;

        init();

        while (true) {
            if (makeMove(currentPlayer, console)) {
                System.out.println(currentPlayer.getName() + " wins in " + currentPlayer.getAttemtps() + " attempts");
                break;
            }
            // логичнее разместить эту проверку выше, но тогда не выполняется условия ДЗ с выводом сообщения, что у
            // конкретного игрока закончились попытки
            if (player1.isOutOfAttempts() && player2.isOutOfAttempts()) {
                System.out.println("Both players out of attempts");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println(player1.getName()+ " attempts: " + Arrays.toString(player1.getNumbers()));
        System.out.println(player2.getName()+ " attempts: " + Arrays.toString(player2.getNumbers()));
    }

    private void init() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        player1.init();
        player2.init();
    }

    private boolean makeMove(Player player, Scanner console) {
        if (player.isOutOfAttempts()) {
            System.out.println(player.getName() + "is out of attempts");
            return false;
        }
        System.out.println(player.getName() + ", enter your number: ");
        player.setNextNumber(console.nextInt());
        console.nextLine();
        return isEqualSecretNumber(player.getCurrentNumber());
    }

    private boolean isEqualSecretNumber(int number) {
        if (secretNumber > number) {
            System.out.println("Secret number is bigger than " + number);
        } else if (secretNumber < number) {
            System.out.println("Secret number is less than " + number);             
        } else if (secretNumber == number) {
           System.out.println("Secret number is equals to " + number);
           return true;
        }
        return false;
    }
}