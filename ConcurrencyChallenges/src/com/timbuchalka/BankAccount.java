package com.timbuchalka;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public synchronized void deposit(double amount){
        balance += amount;
    }

    public synchronized void withdraw(double amount){
        balance -= amount;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}
