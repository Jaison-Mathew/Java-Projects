package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int levelCompleted = 5;
	    int bonus = 100;
        int score = 4000;

	    if (score < 5000 && score > 1000){
            System.out.println("Your score was less than 5000 but greater than 1000.");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000.");
        }else{
            System.out.println("Got it.");
        }

	    if (gameOver == true){
	        int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

	    score = 10000;
	    levelCompleted = 5;
	    bonus = 100;
	    if (gameOver){
	        int secondScore = score + (levelCompleted * bonus);
            System.out.println("Second score is " + secondScore);
        }

	    calculateScore(true, 800, levelCompleted, bonus);
	    calculateScore(true, 10000, 8, 200);

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score is " + highScore);

        int gamerShark = calculateHighScorePosition(1500);
        int playerOne = calculateHighScorePosition(900);
        int rogueThree = calculateHighScorePosition(400);
        int tomRiddle = calculateHighScorePosition(50);
        displayHighScorePosition("gamerShark324", gamerShark);
        displayHighScorePosition("playerOne", playerOne);
        displayHighScorePosition("rogueThree", rogueThree);
        displayHighScorePosition("tomRiddle", tomRiddle);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        }else if (playerScore > 500 && playerScore < 1000){
            return 2;
        }else if (playerScore > 100 && playerScore < 500){
            return 3;
        }else {
            return 4;
        }
    }
}
