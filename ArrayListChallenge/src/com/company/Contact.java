package com.company;

public class Contact {
    private String name;
    private String phoneNumber;

    //constructor that declares private fields
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //returns name of contact
    public String getName() {
        return name;
    }

    //returns phone number of contact
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //method creates new contact
    public static Contact createContact(String name, String phoneNumber){
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}
