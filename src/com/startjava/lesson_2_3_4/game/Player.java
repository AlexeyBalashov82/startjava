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

    public void addNumber(int number) {
        numbers[attemtps] = number;
        attemtps++;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attemtps, 0);
        attemtps = 0;
    }

    public int getCurrentNumber() {
        return numbers[attemtps - 1];
    }
}