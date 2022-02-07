package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {

    private int[] numbers = new int[10];
    private String name;
    private int attemtps;

    public Player(String name) {
        this.name = name;
    }

    public String printNumbers() {
        String result = " ";
        for (int number : Arrays.copyOf(numbers, attemtps)) {
            result += String.valueOf(number) + " ";
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public int getAttemtps() {
        return attemtps;
    }

    public void addNumber(int number) {
        attemtps++;
        numbers[attemtps - 1] = number;
    }

    public void init() {
        Arrays.fill(numbers, 0, attemtps, -1);
        attemtps = 0;
    }

    public int getCurrentNumber() {
        return numbers[attemtps - 1];
    }
}