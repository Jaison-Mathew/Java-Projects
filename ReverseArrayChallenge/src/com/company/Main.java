package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] result = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(result));
        reverse(result);
        System.out.println(Arrays.toString(result));
    }

    //create method that reverses the values of the array elements
    public static void reverse(int[] array){

        int maxArray = array.length - 1;
        int halfArray = array.length / 2;
        for (int i = 0; i < halfArray; i++){
            int temp = array[i];
            array[i] = array[maxArray - i];
            array[maxArray - i] = temp;
        }

    }
}
