
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555-666-7777");

    public static void main(String[] args) {


        boolean quit = false;
        int choice = 0;
        printOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To modify a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addNewContact() {
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone Number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact Added: name = "+ name + " , phone = " + phone );
        }else {
            System.out.println("Can't add, " + name +" already on file");
        }
    }


    private static void updateContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.queryContact(name);

        //checks if contact is in the list
        if(extContact == null)
        {
            System.out.println("Cannot find contact");
            return;
        }

        System.out.println("Enter new Contact Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Phone Number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);

        //Displays if the contact has been updated
        if(mobilePhone.updateContact(extContact, newContact))
        {
            System.out.println("Successfully updated");
        }else {
            System.out.println("Error Updating Contact");
        }
    }

    //removes contact
    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.queryContact(name);

        //checks if contact is in the list
        if(extContact == null)
        {
            System.out.println("Cannot find contact");
            return;
        }

        //Displays if contact is removed
        if(mobilePhone.removeContact(extContact)) {
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error Deleting Contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact extContact = mobilePhone.queryContact(name);
        if(extContact == null)
        {
            System.out.println("Cannot find contact");
            return;
        }

        System.out.println("Name : " + extContact.getName() +
                " Phone Number is: " + extContact.getPhoneNumber());
    }
}

/*  Example from online course

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
*/
