package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter number of elements: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] result = readIntegers(count);

        int miniResult = findMin(result);
        System.out.println("The minimum is " + miniResult);

    }

    //create method that reads how many elements in array
    public static int[] readIntegers(int count){

        int[] arrayList = new int[count];
        for (int i = 0; i < arrayList.length; i++){
            System.out.println("Enter a number: ");
            arrayList[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayList));
        return arrayList;
    }

    //create method that finds the minimum value of the array
    public static int findMin(int[] array){

        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minimum){
                minimum = array[i];
            }
        }

        return minimum;
    }
}
