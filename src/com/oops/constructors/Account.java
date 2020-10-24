package com.oops.constructors;
/*
 *  In the constructors you should not call any methods, not even the getter and setter
 *  as you are in the middle of creating the object and some aspects of initialization
 *  may not have finished.
 */
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){

        // Calling paramterized constructor from default constructor
        this("0000", 0.0, "Null", "Null", "Null");
        System.out.println("Default Constructor called");
    }

    public Account(String number, double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Parameterized Constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    /*
     * creating a object of the class by passing only few values for the field and setting the
     * remaining fields with the default value
     */

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber){

        /*
         * to set the field values we can call the parameterized constructor which assigns the value
         * to the class members
         */
        this("0000", 0.0, customerName, customerEmailAddress, customerPhoneNumber);

        System.out.println("Parameterized constructor with only 3 arguments");
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        }else{
            this.balance -=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
        }
    }
}
