package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        //Another way of assigning arrays
        double[] myDoubleArray = {1.5, 2.6, 3.0, 4.2, 9.1};
        System.out.println(myIntArray[5]);
        System.out.println(myDoubleArray[2]);
        System.out.println(myDoubleArray[0]);
        System.out.println(myDoubleArray[4]);

        //using for loops to assign arrays
        for (int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
            System.out.println("Element " + i + " value is " + myIntArray[i]);
        }

        int[] arrayInt = getIntegers(5);
        for (int i = 0; i < arrayInt.length; i++){
            System.out.println("Element " + i + " typed value is " + arrayInt[i]);
        }

        System.out.println("Average: " + getAverage(arrayInt));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer value.\r");
        int value[] = new int[number];

        for (int i = 0; i < value.length; i++){
            value[i] = scanner.nextInt();
        }

        return value;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
