package com.company;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
	    while (count != 6){
            System.out.println("Value is " + count);
            count++;
        }

	    int moreCount = 1;
	    do{
            System.out.println("Count value is " + moreCount);
            moreCount++;
        }while (moreCount != 6);

	    int num = 1;
	    int evenCount = 0;
	    while (num <= 30){
	        num++;
	        if (!isEvenNumber(num)){
                continue;
            }
            System.out.println(num + " is an even number.");

	        evenCount++;
	        if (evenCount == 5){
                System.out.println("There have been " + evenCount + " even numbers found.");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
