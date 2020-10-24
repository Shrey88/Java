package com.collection.autoboxing_unboxing;

public class BankMain {

    public static void main(String[] args) {
        Bank icici = new Bank("ICICI");

        icici.list_branchCustomers();

        icici.addBranch();

        icici.addCustomer();
        icici.addCustomer();
        icici.addCustomer();
        icici.addCustomer();
        icici.addCustomer();
        System.out.println("");

        icici.addBranch();
        icici.addCustomer();
        icici.addCustomer();
        icici.addCustomer();
        icici.addCustomer();
        System.out.println("");

        icici.list_all_branches();
        System.out.println("");

        icici.list_AllCustomers();
        System.out.println("");

        icici.list_branchCustomers();
        System.out.println("");
    }
}
