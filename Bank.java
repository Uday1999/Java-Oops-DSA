package com.udemy.challenges;

import java.util.ArrayList;

public class Bank {

    private String BankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.BankName = bankName;
        branches = new ArrayList<>();
    }

//    addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
//    It returns true if the branch was added successfully or false otherwise.

    public boolean addBranch(String branchName){

        if(findBranch(branchName) == null){
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            return  true;
        }
        return false;
    }

//    addCustomer(), has three parameters of type String (name of the branch),
//    String (name of the customer), double (initial transaction) and returns a boolean.
//    It returns true if the customer was added successfully or false otherwise.

    public boolean addCustomer(String branchName, String customer, double transaction){

        Branch br = findBranch(branchName) ;
        if(br != null){
            return br.newCustomer(customer, transaction);
        }
        return false;
    }

//    addCustomerTransaction(), has three parameters of type String (name of the branch),
//    String (name of the customer), double (transaction) and returns a boolean.
//    It returns true if the customers transaction was added successfully or false otherwise.

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){

        Branch br = findBranch(branchName);
        if(br != null){
            return br.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }
//    listCustomers(), has two parameters of type String (name of the Branch),
//    boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise.
//    This method prints out a list of customers.

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (Customer customer : branchCustomers) {
                System.out.println("Customer: " + customer.getName());
                if (printTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (Double transaction : transactions) {
                        System.out.println("Transaction amount: " + transaction);
                    }
                }
            }
            return true;
        }
        return false;
    }


//    findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
//    Return the Branch if it exists or null otherwise

    public Branch findBranch(String branchName){

        for(Branch br : branches){
            if(br.getName().equals(branchName)){
                return br;
            }
        }
        return null;
    }


}
