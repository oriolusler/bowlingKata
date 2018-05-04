package com.drpicox.bowlingKata;

public class Game {

    private int score = 0;
    private int rolls[] = new int[21];
    private int currentRoll = 0;

    public void roll(int i) {
        score += i;
        rolls[currentRoll++] = i;
    }

    public int score() {
        return score;
    }
}
