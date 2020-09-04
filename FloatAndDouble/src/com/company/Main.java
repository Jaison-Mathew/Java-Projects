package com.company;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Minimum Float Value: " + myMinFloatValue);
        System.out.println("Maximum Float Value: " + myMaxFloatValue);

        Double myMinDoubleValue = Double.MIN_VALUE;
        Double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Minimum Double Value: " + myMinDoubleValue);
        System.out.println("Maximum Double Value: " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatVal = (float) 5.25 / 2;    //Can also try 5.25f
        double myDoubleVal = 5.25d / 2d;        //Can also try (double) 5.25 / 2
        System.out.println("My Integer Value: " + myIntValue);
        System.out.println("My Float Value: " + myFloatVal);
        System.out.println("My Double Value: " + myDoubleVal);

        double pounds = 200d;
        double poundToKilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is equal to " + poundToKilograms + " kilograms.");
        
    }
}
