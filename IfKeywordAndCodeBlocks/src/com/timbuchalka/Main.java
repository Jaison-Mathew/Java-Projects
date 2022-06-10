package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int score = 800;

	    boolean isGameOver = true;
	    int levelCompleted = 5;
	    int bonus = 100;

/*
	    if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        }else if (score <= 1000){
            System.out.println("Your score was less than or equal to 1000");
        }else {
            System.out.println("Got here");
        }
*/
        if (!isGameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
