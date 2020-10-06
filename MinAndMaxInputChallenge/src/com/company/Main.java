package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentMax = -2147483647;       //current maximum set to lowest int value
        int min = 2147483647;           //current minimum set to to highest int value
        while(true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                if (number > currentMax){       //number will replace currentMax if greater
                    currentMax = number;
                }else{
                    if (number < min){
                        min = number;
                    }
                }
                scanner.nextLine();
            }else {
                System.out.println("The maximum number is " + currentMax + ", and the minimum is " + min);
                break;
            }

        }

        scanner.close();
    }
}
