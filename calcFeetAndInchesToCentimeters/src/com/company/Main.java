package com.company;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(2.0d, 7.0d);

        calcFeetAndInchesToCentimeters(7);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >= 0 && inches <= 12)){
            double feetToCent = feet * (12d * 2.54d);
            double inchToCent = inches * 2.54d;
            double centimeters = feetToCent + inchToCent;
            System.out.println(feet + " ft and " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        }else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if (inches >= 0){
            double inchResult = (int) inches % 12;
            double feetResult = (int) inches / 12;
            System.out.println(inches + " inches is equal to " + feetResult + " ft and " + inchResult + " inches");
            return calcFeetAndInchesToCentimeters(feetResult, inchResult);
        }else {
            return -1;
        }
    }
}