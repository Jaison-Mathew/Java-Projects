package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "Tokyo");
        addInOrder(placesToVisit, "Venice");
        addInOrder(placesToVisit, "Norway");
        addInOrder(placesToVisit, "London");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Miami");
        addInOrder(placesToVisit, "Tokyo");
        printList(placesToVisit);
        visit(placesToVisit);

        /*How to add, insert, and remove elements from list
        placesToVisit.add("New York");
        placesToVisit.add("Venice");
        placesToVisit.add("Tokyo");
        placesToVisit.add("London");
        placesToVisit.add("Norway");

        printList(placesToVisit);

        placesToVisit.add(2, "Honolulu");
        printList(placesToVisit);

        placesToVisit.remove(3);
        printList(placesToVisit);*/


    }


    //method prints values in the linked list
    private static void printList(LinkedList<String> linkedList){
        //iterator used to display list values. Good substitute to for loops
        Iterator<String> i = linkedList.iterator();

        //loop continues if next list index has a value
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("---------------------------");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison ==0){
                //if it equals 0, do not add to the list
                System.out.println(newCity + " is already included to the destination.");
                return false;
            }else if (comparison > 0){
                //if greater than 0, newCity should appear first
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0){
                // if less than 0, then comparison moves to next city

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    //method display each value of list in order when inputted
    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in itinerary");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Vacation over.");
                    quit = true;
                    break;
                case 1:
                    //checks if it is okay to move to the next place in list
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    //if selected, goes to the next place in list
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    //checks if it is okay to move to the previous place in list
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    //if selected, goes to previous place in list
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    //if selected, prints options menu
                    printMenu();
                    break;
            }

        }
    }

    //prints menu of options
    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}
