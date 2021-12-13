package com.timbuchalka;

import java.util.concurrent.TimeUnit;
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

        boolean status = false;
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {                   //the critical section of code is in the try/finally block to ensure that the lock will be released.
                    balance += amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock.");
            }
        }catch (InterruptedException e){
            //do something here
        }

        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount){

        boolean status = false;         //local variables such as status are already threadsafe
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance -= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock.");
            }
        }catch (InterruptedException e){
            //do something here
        }

        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void printAccountNumber(){
        System.out.println("Account number = " + accountNumber);
    }
}
