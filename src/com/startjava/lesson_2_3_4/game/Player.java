package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

class Player {

    private int[] numbers = new int[10];
    private String name;
    private int attemtps;

    public Player(String name) {
        this.name = name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemtps);
    }

    public String getName() {
        return name;
    }

    public int getAttemtps() {
        return attemtps;
    }

    public void setNextNumber(int number) {
        this.attemtps++;
        this.numbers[attemtps - 1] = number;
    }

    public void init() {
        attemtps = 0;
        Arrays.fill(numbers, -1);
    }

    public int getCurrentNumber() {
        return numbers[attemtps - 1];
    }

    public boolean isOutOfAttempts() {
        return attemtps >= 10;
    }
}