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
}
