package com.satya;

public class Main {

    public static void main(String[] args) {
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Satya", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Satya", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Satya", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Satya", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int positionOnTable) {
        System.out.println(playerName + " managed to get into position " + positionOnTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore > 1000) return 1;
        else if(playerScore > 500 && playerScore < 1000) return 2;
        else if(playerScore > 100 && playerScore < 500) return 3;
        else return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        else {
            return -1;
        }
    }

}
