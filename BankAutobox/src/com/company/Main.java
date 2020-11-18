package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 40.12);
        bank.addCustomer("Adelaide", "Kim", 120.01);
        bank.addCustomer("Adelaide", "jim", 12.12);

        bank.addBranch("New York");
        bank.addCustomer("New York", "Joe", 1234.98);
        bank.addCustomer("New York", "Mike", 34.12);
        bank.addCustomer("New York", "Tom", 78.56);

        bank.addCustomerTransactions("Adelaide", "Tim", 12.01);
        bank.addCustomerTransactions("Adelaide", "Tim", 10.03);
        bank.addCustomerTransactions("Adelaide", "jim", 10.01);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("New York", true);

        bank.addBranch("Miami");

        //testing if Adelaide branch already exists
        if (!bank.addBranch("Adelaide")){
            System.out.println("Error! Adelaide branch already exists.");
        }

        //testing if branch already exists
        if (!bank.addCustomer("Miami", "Bill", 50.12)){
            System.out.println("Error! Miami branch does not exist");
        }

        //testing if customer already exists
        if (!bank.addCustomerTransactions("New York", "Andy", 50.12)){
            System.out.println("Error! customer does not exist");
        }

        //testing if customer already exists in a specific branch
        if (bank.addCustomer("Adelaide", "Tim", 40.12)){
            System.out.println("Customer Tim already exists in Adelaide branch.");
        }
    }
}
