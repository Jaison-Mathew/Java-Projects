package com.company;

public class BankAccount {

    //create fields for bank account
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //creating BankAccount constructor with parameters
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //create setters and getters for each field
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //create method to deposit funds
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is " + this.balance);
    }

    //create method to withdraw funds
    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        }else {
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " processed. Remaining balance is $" + this.balance);
        }
    }
}
