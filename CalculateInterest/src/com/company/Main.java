package com.company;

public class Main {

    public static void main(String[] args) {
        for (double i = 2.0; i <= 8; i++){
            System.out.println("10,000 at " + (int) i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************");

        for (double i = 8.0; i >= 2; i--){
            System.out.println("10,000 at " + (int) i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("******************************");

        int count = 0;
        for (int i = 12; i<=30; i++){
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                count++;
                if (count == 3){
                    System.out.println("There are three or more prime numbers.");
                    break;
                }
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for (int i = 2; i<= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
