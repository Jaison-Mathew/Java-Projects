package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(3);
        printDayOfTheWeek(8);

        //Using if statement to determine day of the week
        int today = 1;
        if (today == 0){
            System.out.println("Sunday");
        }else if (today == 1){
            System.out.println("Monday");
        }else if (today == 2){
            System.out.println("Monday");
        }else if (today == 3){
            System.out.println("Monday");
        }else if (today == 4){
            System.out.println("Monday");
        }else if (today == 5){
            System.out.println("Monday");
        }else if (today == 6){
            System.out.println("Monday");
        }else{
            System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeek(int day){
        //Using switch statement to determine day of the week
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
