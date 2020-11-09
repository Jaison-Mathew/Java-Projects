package com.company;

import java.util.ArrayList;

public class MobilePhone{

    private ArrayList<String> name = new ArrayList<String>();
    private ArrayList<String> phoneNumber = new ArrayList<String>();

    //method that adds new contact to the array list
    public void addContact(String newName, String newNumber){
        name.add(newName);
        phoneNumber.add(newNumber);
    }

    //methods to check if contact is in the array list
    private int findItem(String searchItem){
        return name.indexOf(searchItem);
    }

    public boolean onList(String findItem){
        int position = findItem(findItem);
        if (position >= 0){
            return true;
        }
        return false;
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
    }
}
