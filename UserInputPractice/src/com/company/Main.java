package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int counter = 0;
        while (true){       //creating endless loop
            int order = counter + 1;    //used to display order of numbers from 1 to 10
            System.out.println("Enter number #" + order + ": ");
            boolean nextInt = scanner.hasNextInt();
            if (nextInt){   //checks if next input is an integer

                int num = scanner.nextInt();
                counter++;
                sum += num;
                if (counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number.");
            }
            scanner.nextLine();     //handles next line (enter key)
        }
        System.out.println("The sum of the numbers is " + sum);
        scanner.close();
    }
}
