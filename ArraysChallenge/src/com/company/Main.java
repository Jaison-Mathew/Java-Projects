package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] result = getIntegers(5);
        int[] sortedResult = sortIntegers(result);
        printArray(sortedResult);

    }

    //create method that will input the array list of integers
    public static int[] getIntegers(int arrayList){

        int[] newList = new int[arrayList];
        for (int i = 0; i < newList.length; i++){
            System.out.println("Enter number: ");
            newList[i] = scanner.nextInt();
        }
        return newList;
    }

    //create method that prints the array
    public static void printArray(int[] arrayToPrint){

        for (int i = 0; i < arrayToPrint.length; i++){
            System.out.println("Element " + i + " is " + arrayToPrint[i]);
        }
    }

    //create method that sorts the list from getIntegers method
    public static int[] sortIntegers(int[] sortList){

        int[] newList = new int[sortList.length];
        for (int x = 0; x < newList.length; x++){
            //moving elements from newList array to sortList array
            newList[x] = sortList[x];

        }

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            //while loop will restart when current array element in for loop finds element greater in the array
            for (int i = 0; i < newList.length-1; i++){
                if (newList[i] < newList[i+1]){
                    //swapping elements
                    temp = newList[i];
                    newList[i] = newList[i+1];
                    newList[i+1] = temp;
                    flag = true;
                }
            }
        }

        return newList;
    }
}
