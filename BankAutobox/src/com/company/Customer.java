package com.company;

import java.util.ArrayList;

public class Customer{
    private String name;
    private ArrayList<Double> transaction;

    //initializing name and transaction in constructor
    public Customer(String name, double transaction) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(transaction);
    }

    public void addTransaction(double amount){
        transaction.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}
