package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    //assigning variables with maximum and minimum values that can be inputted in integer datatype.
	    int myMinIntVal = Integer.MIN_VALUE;
	    int myMaxIntVal = Integer.MAX_VALUE;
        System.out.println("Minimum Integer Value: " + myMinIntVal);
        System.out.println("Maximum Integer Value: " + myMaxIntVal);
        System.out.println("Busted MAX value: " + (myMaxIntVal + 1));
        System.out.println("Busted MIN value: " + (myMinIntVal - 1));

        //Assigning variables with minimum and maximum values that can be inputted in byte datatype.
        byte myMinByteVal = Byte.MIN_VALUE;
        byte myMaxByteVal = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value: " + myMinByteVal);
        System.out.println("Maximum Byte Value: " + myMaxByteVal);

        //Assigning variables with minimum and maximum values that can be inputted in short datatype.
        Short myMinShortVal = Short.MIN_VALUE;
        Short myMaxShortVal = Short.MAX_VALUE;
        System.out.println("Minimum Short Value: " + myMinShortVal);
        System.out.println("Maximum Short Value: " + myMaxShortVal);

        long myLongValue = 100L;
        //Assigning variables with minimum and maximum values that can be inputted in long datatype.
        Long myMinLongVal = Long.MIN_VALUE;
        Long myMaxLongVal = Long.MAX_VALUE;
        System.out.println("Minimum Long Value: " + myMinLongVal);
        System.out.println("Maximum Long Value: " + myMaxLongVal);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntVal / 2);
        byte myNewByteValue = (byte) (myMinByteVal / 2);
        short myNewShortValue = (short) (myMinShortVal / 2);
    }
}
