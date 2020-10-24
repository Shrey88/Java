package com.collection.autoboxing_unboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Branch> branchArrayList = new ArrayList<Branch>();
    private String bankName;


    public Bank(String bankName){
        this.bankName = bankName;
    }

    public static Bank createBank(String bankName){
        return (new Bank(bankName));
    }

    public void addBranch(){
        System.out.println("Add Branch In The System");
        System.out.print("Enter Branch Name :");
        String branchName = scanner.nextLine();
        System.out.println("");
        if(addBranch(branchName)){
            System.out.println("New branch " + branchName + " added");
        }
    }

    private boolean addBranch(String branchName){
        Branch newBranch = Branch.createBranch(branchName);
        if(validate_branch(newBranch)){
            System.out.println(branchName + " Branch already exist");
            return false;
        }else{
            this.branchArrayList.add(newBranch);
            return true;
        }
    }

    public void addCustomer(){
        System.out.println("Add Customer Form");
        System.out.print("Enter Branch Name : ");
        String branchName = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter Customer Name : ");
        String customerName = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter Initial Transaction : ");
        double initTrans = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("");
        if(addCustomer(customerName, initTrans, branchName)){
            System.out.println("Customer " + customerName + " added in " + this.bankName +" bank, in " +
                    branchName + " branch");
        }
    }

    private boolean addCustomer(String customerName, double initTrans, String branchName){
        Branch branch = new Branch(branchName);
        Customer customer = Customer.createCustomer(customerName,initTrans);

        if(!validate_branch(branch)){
            System.out.println(branchName + " branch does not exist.");
            System.out.println("Could not add new customer");
            return false;
        }else{
            int position = find_branch(branch);
            if(position >= 0){
                if(!validate_customer(position, customerName)){
                    branchArrayList.get(position).add_Customer(customer);
                    return true;
                }else{
                    System.out.println("Customer " + customerName + " already exist in " + this.bankName +
                            " bank, in " + branchName + " branch");
                    return false;
                }
            }
        }
        return false;
    }


    public void addTransaction(){
        System.out.println("Add Transaction of Customer");
        System.out.print("Enter Branch Name : ");
        String branchName = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter Customer Name : ");
        String customerName = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter New Transaction : ");
        double initTrans = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("");

        if(addTransaction(branchName, customerName, initTrans)){
            System.out.println("New Transaction " + initTrans + " added");
        }
    }

    private boolean addTransaction(String branchName, String customerName, double initTrans){
        Branch branch = Branch.createBranch(branchName);

        if(!validate_branch(branch)){
            System.out.println(branchName + " branch does not exist.");
            System.out.println("Could not add new customer");
            return false;
        }else{
            int position = find_branch(branch);
            if(position >= 0){
                if(!validate_customer(position, customerName)){
                    int arr_size = branchArrayList.get(position).get_CustomerList().size();
                    ArrayList<Customer> customerList = branchArrayList.get(position).get_CustomerList();
                    for(int i = 0; i < arr_size; i++){
                        if(customerList.get(i).getCustomerName().compareTo(customerName) == 0){
                            customerList.get(i).addTransaction(initTrans);
                        }
                    }
                    return true;
                }else{
                    System.out.println("Customer " + customerName + " already exist in " + this.bankName +
                            " bank, in " + branchName + " branch");
                    return false;
                }
            }
        }
        return false;
    }

    private boolean validate_branch(Branch branch){
        if(branchArrayList.size() > 0) {
            int list_size = this.branchArrayList.size();
            for(int i = 0; i < list_size; i++){
                if(this.branchArrayList.get(i).get_BranchName().compareTo(branch.get_BranchName()) == 0){
                    return true;
                }
            }
        }

        return false;
    }

    private int find_branch(Branch branch){
        if(branchArrayList.size() > 0) {
            int list_size = this.branchArrayList.size();
            int i = 0;
            for(; i < list_size; i++){
                if(this.branchArrayList.get(i).get_BranchName().compareTo(branch.get_BranchName()) == 0){
                    return i;
                }
            }
        }else{
            System.out.println("Branch list is empty");
        }

        return -1;
    }

    private boolean validate_customer(int position, String customer){
        int arr_size = branchArrayList.get(position).get_CustomerList().size();
        ArrayList<Customer> customerArrayList = branchArrayList.get(position).get_CustomerList();
        for(int i = 0; i < arr_size; i++){
            if(customerArrayList.get(i).getCustomerName().compareTo(customer) == 0){
                return true;
            }
        }

        return false;
    }

    public void list_all_branches(){
        listBranches();
    }

    private void listBranches(){
        if(branchArrayList.size() > 0){
            for(int i = 0; i < branchArrayList.size(); i++){
                System.out.println("Branch #" + (i+1) + " : " + branchArrayList.get(i).get_BranchName());
            }
        }
        else{
            System.out.println("Branch List is Empty");
        }

    }

    public void list_AllCustomers(){
        allCustomers();
    }

    private void allCustomers(){
        if(branchArrayList.size()>0){
            for(int i = 0; i < branchArrayList.size(); i++){
                System.out.println("Branch #" + (i+1) + " : " + branchArrayList.get(i).get_BranchName() );
                ArrayList<Customer> customerList = branchArrayList.get(i).get_CustomerList();
                if(customerList.size() > 0) {
                    for (int j = 0; j < customerList.size(); j++) {
                        System.out.println("\t Customer #" + (j + 1) + " : " + customerList.get(j).getCustomerName());
                    }
                }else{
                    System.out.println("Customer List is Empty");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Branch List is Empty");
        }
    }

    public void list_branchCustomers(){
        branchCustomers();
    }

    private void branchCustomers(){
        boolean customerFound = false;

        System.out.print("Enter Branch Name : ");
        String branchName = scanner.nextLine();
        System.out.print("Enter Customer Name : ");
        String customerName = scanner.nextLine();

        if(branchArrayList.size() > 0)
        {
            for(int i = 0; i < branchArrayList.size(); i++){
                if(branchArrayList.get(i).get_BranchName().compareTo(branchName) == 0){
                    int arr_size = branchArrayList.get(i).get_CustomerList().size();
                    if(arr_size > 0){
                        for(int j = 0; j < arr_size; j++){
                            if(branchArrayList.get(i).get_CustomerList().get(j).getCustomerName().compareTo(customerName) == 0){
                                System.out.print("Branch : " + branchName + " Customer : " + customerName);
                                customerFound = true;
                                break;
                            }
                        }
                    }else{
                        System.out.println("Customer List is Empty for branch " + branchName);
                    }
                }
                if(customerFound)
                    break;
            }
        }else{
            System.out.println("Branch List is Empty");
        }
    }
}
