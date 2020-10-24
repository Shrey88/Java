package com.collection.autoboxing_unboxing;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    private String branchName;

    public Branch(String branchName){
        this.branchName = branchName;
    }

    public static Branch createBranch(String branchName){
        return (new Branch(branchName));
    }

    public ArrayList<Customer> get_CustomerList(){
        return customerArrayList;
    }

    public void add_Customer(Customer customer){
        this.customerArrayList.add(customer);
    }

    public String get_BranchName(){
        return branchName;
    }
}
