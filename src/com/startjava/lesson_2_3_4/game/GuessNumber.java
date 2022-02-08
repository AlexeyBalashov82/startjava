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

    public void play() {
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
            if (isOutOfAttempts(player1) && isOutOfAttempts(player2)) {
                System.out.println("Both players out of attempts");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        System.out.println(printPlayerNumbers(player1));
        System.out.println(printPlayerNumbers(player2));
    }

    private void init() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player player, Scanner console) {
        if (isOutOfAttempts(player)) {
            System.out.println(player.getName() + "is out of attempts");
            return false;
        }
        System.out.println(player.getName() + ", enter your number: ");
        player.addNumber(console.nextInt());
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

    private boolean isOutOfAttempts(Player player) {
        return player.getAttemtps() >= 10;
    }

    private String printPlayerNumbers(Player player) {
        String result = " ";
        for (int number : player.getNumbers()) {
            result += String.valueOf(number) + " ";
        }
        return player.getName() + " attempts: " + result;
    }
}