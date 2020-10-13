package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount myBank = new BankAccount(1234567, 547.23, "Jeff Burns",
                "jburns@aol.com", "(555)555-5555");

        /*Same as writing
        myBank.setAccountNumber(1234567);
        myBank.setBalance(547.23);
        myBank.setCustomerName("Jeff Burns");
        myBank.setEmail("jburns@aol.com");
        myBank.setPhoneNumber("(555)555-5555");*/

        System.out.println("Name: " + myBank.getCustomerName());
        System.out.println("Account Number: " + myBank.getAccountNumber());
        System.out.println("Current Balance: " + myBank.getBalance());
        System.out.println("Email Address: " + myBank.getEmail());
        System.out.println("Phone Number: " + myBank.getPhoneNumber());

        myBank.deposit(200.01);

        myBank.withdraw(3000.00);

        myBank.withdraw(30.00);


        VipCustomer person = new VipCustomer();
        System.out.println(person.getName());

        VipCustomer guy = new VipCustomer("jeff", 2500);
        System.out.println(guy.getName());

        VipCustomer sir = new VipCustomer("Bob", 4600, "bob@aol.com");
        System.out.println(sir.getName());
        System.out.println(sir.getEmailAddress());

    }
}
