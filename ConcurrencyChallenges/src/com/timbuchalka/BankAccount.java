package com.timbuchalka;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;

    private Lock lock;             //only one lock object is needed because both threads need to compete for the same lock.

    public BankAccount(String accountNumber, double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
        this.lock = new ReentrantLock();        //Using ReentrantLock class, instead of synchronized keyword, to make the BankAccount class threadsafe.
    }

    public void deposit(double amount){
        lock.lock();
        try {           //the critical section of code is in the try/finally block to ensure that the lock will be released.
            balance += amount;
        }finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount){
        lock.lock();
        try{
            balance -= amount;
        }finally {
            lock.unlock();
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}
