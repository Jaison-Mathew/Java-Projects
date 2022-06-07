package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        int finalScore = 50;
        int playersHighScore;

        int calculatedScore = finalScore = 60;
        System.out.println("Calculated Score = " + calculatedScore);

        finalScore = 70;

        int playerLives = 3;

        //playerLives--;
        System.out.println("Lives remaining = " + playerLives--);
        System.out.println("Lives is now " + playerLives);

        //playerLives is currently set to 2
        System.out.println("And subtracting 1 from lives = " + --playerLives);

        //playerLives is currently set to 1
        System.out.println("Lives remaining = " + playerLives++);       //Output should be 1
        System.out.println("Lives is now " + playerLives);      //Output should be 2
        System.out.println("And adding 1 to lives = " + ++playerLives);

        //playerLives is currently set to 3
        playerLives++;
        System.out.println("Lives remaining = " + playerLives);     //Output should be 4
        playerLives--;
        System.out.println("Lives remaining = " + playerLives);     //Output should be 3
        ++playerLives;
        System.out.println("Lives remaining = " + playerLives);     //Output should be 4
        --playerLives;
        System.out.println("Lives remaining = " + playerLives);     //Output should be 3

        if (calculatedScore > 59){
            System.out.println("I calculate your score as being more than 59!");
        }
    }
}
