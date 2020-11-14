package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone contact = new MobilePhone();
    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printOptions();
                    break;
                case 1:
                    printPhoneContacts();
                    break;
                case 2:
                    addPhoneContact();
                    break;
                case 3:
                    modifyPhoneContact();
                    break;
                case 4:
                    removePhoneContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printOptions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    //prints all contacts entered
    public static void printPhoneContacts(){
        contact.printContact();
    }

    //adds new contacts and checks if the name was already added
    public static void addPhoneContact(){
        System.out.println("Enter name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number (xxx-xxx-xxxx):");
        String newNum = scanner.nextLine();

        if (contact.onList(newName) || contact.onList(newNum)){
            System.out.println("Error! The name or number entered already exists in the list.");
            return;
        }else {
            contact.addContact(newName, newNum);
        }
    }

    //removes existing contact
    public static void removePhoneContact(){
        System.out.println("Enter name to remove: ");
        contact.removeContact(scanner.nextLine());
    }

    //modifies existing contact
    public static void modifyPhoneContact(){
        System.out.println("Enter name of contact: ");
        String contactName = scanner.nextLine();
        if (!contact.onList(contactName)){
            System.out.println("Error! Name does not exist in contact list.");
            return;
        }
        System.out.println("Enter replacement number (xxx-xxx-xxxx): ");
        String newContactName = scanner.nextLine();
        if (contact.onList(newContactName) || contact.onList(contactName)){
            System.out.println("Error, number exists in another contact.");
            return;
        }
        contact.modifyContact(contactName, newContactName);
    }

    public static void searchContact(){
        System.out.println("Enter name: ");
        String nameFind = scanner.nextLine();
        if (contact.onList(nameFind)){
            System.out.println(nameFind + " is found in your contact list.");
        }else{
            System.out.println(nameFind + " does exist in your contact list.");
        }
    }
}
