package com.oops.constructors;

import java.util.function.DoubleToIntFunction;

public class AccountMain {
    public static void main(String[] args) {
        Account bobsAccount = new Account(); // it calls the default constructor / no parameter constructor

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        System.out.println("");


        /*
         *  constructor with parameters called.
         */
        Account timsAccount = new Account("12345", 0.00, "Tim",
                "myemail@tim.com", "(087) 123-45567");

        System.out.print("Account number : " + timsAccount.getNumber() + "\n");
        System.out.print("Account balance : " + timsAccount.getBalance() + "\n");
        System.out.print("Account Customer Name : " + timsAccount.getCustomerName() + "\n");
        System.out.print("Account Customer Email Address : " + timsAccount.getCustomerEmailAddress() + "\n");
        System.out.print("Account Customer Phone Number : " + timsAccount.getCustomerPhoneNumber() + "\n");
        System.out.println("");

        /*
         *  after initializing the object some default values will be set
         *  to the class fields by calling the parameterized constructors
         */
        Account samAccount = new Account();

        System.out.print("Account number : " + samAccount.getNumber() + "\n");
        System.out.print("Account balance : " + samAccount.getBalance() + "\n");
        System.out.print("Account Customer Name : " + samAccount.getCustomerName() + "\n");
        System.out.print("Account Customer Email Address : " + samAccount.getCustomerEmailAddress() + "\n");
        System.out.print("Account Customer Phone Number : " + samAccount.getCustomerPhoneNumber() + "\n");
        System.out.println("");

        /*
         *  creating the class object by passing only the customer name , email address and phone number
         */
        Account tomAccount = new Account("Tom", "tom@gmail.com",
                "(023) 989-234234");

        System.out.print("Account number : " + tomAccount.getNumber() + "\n");
        System.out.print("Account balance : " + tomAccount.getBalance() + "\n");
        System.out.print("Account Customer Name : " + tomAccount.getCustomerName() + "\n");
        System.out.print("Account Customer Email Address : " + tomAccount.getCustomerEmailAddress() + "\n");
        System.out.print("Account Customer Phone Number : " + tomAccount.getCustomerPhoneNumber() + "\n");
    }
}
