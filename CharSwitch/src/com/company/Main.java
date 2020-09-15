package com.company;

public class Main {

    public static void main(String[] args) {

        char letter = 'b';

        switch (letter){
            case 'A': case 'a':
                System.out.println("Letter 'A' has been found");
                break;

            case 'B': case 'b':
                System.out.println("Letter 'B' has been found");
                break;

            case 'C': case 'c':
                System.out.println("Letter 'C' has been found");
                break;

            case 'D': case 'd':
                System.out.println("Letter 'D' has been found");
                break;

            case 'E': case 'e':
                System.out.println("Letter 'E' has been found");
                break;

            default:
                System.out.println("Letter not found");
                break;
        }
    }
}
