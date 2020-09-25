package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = sumDigits(125);
        System.out.println(" The digit sum is " + result);
        result = sumDigits(1);
        System.out.println(" The digit sum is " + result);

    }

    public static int sumDigits(int number){

        if (number < 10){
            return -1;
        }

        //int numExtract = number;
        //int numDiscard = number;
        int dSum = 0;
        do {
            int numExtract = number % 10;
            dSum += numExtract;
            number /= 10;
        }while (number > 0);

        return dSum;
    }
}
