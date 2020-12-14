package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MobilePhone{

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    //adds new contact to list
    public boolean addNewContact(Contact contact){
        if (findContact(contact) < 0){
            this.myContacts.add(contact);
            return true;
        }else {
            System.out.println("Error! Contact already exists.");
            return false;
        }
    }

    //finds contact based on element position
    private int findContact(Contact contact){
        if (this.myContacts.indexOf(contact) >= 0){
            return this.myContacts.indexOf(contact);
        }else {
            return -1;
        }
    }

    //finds contact based on name
    private int findContact(String name){
        for (int i = 0; i < myContacts.size(); i++){
            //creating temporary object to hold the name and compare
            Contact tmp = this.myContacts.get(i);
            if (tmp.getName().equals(name)){
                return i;
            }
        }
        return -1;

    }

    //removes contact from list
    public boolean removeContact(Contact contact){
        if (findContact(contact) >= 0){
            this.myContacts.remove(findContact(contact));
            System.out.println("Contact removed.");
            return true;
        }else {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
    }

    //updates contact in list
    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) >= 0){
            this.myContacts.set(findContact(oldContact), newContact);
            System.out.println("Contact updated. " + oldContact.getName() + " has been replaced with " + newContact.getName());
            return true;
        }
        System.out.println(oldContact.getName() + " was not found.");
        return false;
    }

    //searches for contact based on name inputted
    public Contact queryContact(String name){
        if (findContact(name) >= 0){
            return this.myContacts.get(findContact(name));
        }else {
            return null;
        }
    }

    public void printContacts(){
        for (int i = 0; i< myContacts.size(); i++){
            System.out.println((i+1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    /*Example used from online course
    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> phoneNumber = new ArrayList<String>();

    //method that adds new contact to the array list
    public void addContact(String newName, String newNumber){
        name.add(newName);
        phoneNumber.add(newNumber);
    }

    //methods to check if name of contact is in the array list
    private int findItem(String searchItem){
        return name.indexOf(searchItem);
    }

    public boolean onList(String findItem){
        int position = findItem(findItem);
        int phoneNumPosition = findNumberItem(findItem);
        if (position >= 0 || phoneNumPosition >= 0){
            return true;
        }
        return false;
    }

    //methods to check if phone number of contact is in the array list
    private int findNumberItem(String searchNum){
        return phoneNumber.indexOf(searchNum);
    }

    //method that prints contacts
    public void printContact(){

        System.out.println("You have " + name.size() + " contact(s) in your phone.");
        for (int i = 0; i < name.size(); i++){
            System.out.println((i+1) + ".) Name: " + name.get(i));
            System.out.println("Phone Number: " + phoneNumber.get(i));
        }
    }

    //modifies contact of the index that has the oldName value in array list
    public void modifyContact(String oldName, String newName){

        int positionIndex = findItem(oldName);
        if (positionIndex >= 0){
            modifyContact(positionIndex, newName);
        }
    }

    //method that modifies existing contact in the position index of phoneNumber
    public void modifyContact(int position, String number){
        phoneNumber.set(position, number);
        System.out.println(name.get(position) + "'s number has been changed.");
    }

    //method that removes contact from the array list
    public void removeContact(String byeName){
        name.remove(byeName);
    }*/
}
