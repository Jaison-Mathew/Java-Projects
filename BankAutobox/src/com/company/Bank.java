package com.company;

import java.util.ArrayList;

public class Bank{

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //add new branch
    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    //add new customer
    public boolean addCustomer(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        // checks if the branch exists in array list
        if (branch != null){
            return branch.addNewCustomer(customerName, amount);
        }

        return false;
    }

    //adds customer transaction
    public boolean addCustomerTransactions(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null){
            return branch.addNewTransaction(customerName, initialAmount);
        }

        return false;
    }

    //method that checks if branch is in the list
    private Branch findBranch(String branchName){

        for (int i = 0; i < this.branches.size(); i++){
            Branch checkBranch = this.branches.get(i);
            if (checkBranch.getName().equals(branchName)){
                return checkBranch;
            }

        }
        return null;
    }

    //displays list of customers
    public boolean listCustomer(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer details of branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            //Listing customers from the branch
            for (int i=0; i< branchCustomers.size(); i++){
                //unboxing to get values of branchCustomers list
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if (showTransaction){
                    System.out.println("Transactions");
                    //Listing transactions from the branch
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for (int j =0; j<transactions.size(); j++){
                        //unboxing to get values of transactions list
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));

                    }
                }
            }
            return true;
        }
        return false;
    }

}
