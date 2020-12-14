package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] result = {1, 2, 3, 4, 5};
        reverse(result);
    }

    //create method that reverses the values of the array elements
    private static void reverse(int[] array){

        int maxArray = array.length - 1;
        int halfArray = array.length / 2;
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < halfArray; i++){
            int temp = array[i];
            array[i] = array[maxArray - i];
            array[maxArray - i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
