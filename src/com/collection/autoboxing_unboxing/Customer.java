package com.collection.autoboxing_unboxing;

import com.oops.static_method.Calculator;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName, Double transactions){
        this.customerName = customerName;
        this.transactions.add(transactions);
    }

    public static Customer createCustomer(String customerName, double transactions){
        return (new Customer(customerName, Double.valueOf(transactions)) );
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addTransaction(double transactions) {
        setTransactions(transactions);
    }

    private void setTransactions(double transactions){
        this.transactions.add(transactions);
    }
}
