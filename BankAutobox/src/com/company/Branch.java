package com.company;

import java.util.ArrayList;

public class Branch{

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //add new customer
    public boolean addNewCustomer(String newName, double initialAmount){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(newName, initialAmount));
            return true;
        }
        return false;
    }

    //add new transaction
    public boolean addNewTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        //if the customer already exists, the transaction will be updated
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    //method that checks if customer is in the list
    private Customer findCustomer(String customerName){

        for (int i = 0; i < this.customers.size(); i++){
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
            
        }
        return null;
    }


}
