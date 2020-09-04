package com.company;

public class Main {

    public static void main(String[] args) {
	    byte validByte = 10;
	    short validShort = 20;
        int validInteger = 50;
        long total = 50000L + (10L * (validByte + validShort + validInteger));

        System.out.println("The total amount is " + total);

    }
}
