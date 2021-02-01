package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*My attempt, same output

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int X = scanner.nextInt();
        for (int x = 1; x <= 12; x++){
            System.out.println(X + " * " + x + " = " + (X*x));
        }*/


        X x = new X(new Scanner(System.in));
        x.x();

    }
}
