package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    //create default constructor
    public VipCustomer(){
        this("Default Name", 500, "default@email.com");
    }

    //create constructor that inputs name and creditLimit using parameters, and email is defaulted
    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }




}
