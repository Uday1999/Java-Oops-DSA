package com.udemy.challenges;

import java.util.ArrayList;

// -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
//
//        -  A constructor that takes a  String (name of customer) and a double (initial transaction).
//        It initialises name and instantiates transactions.
//
//        -  And three methods, they are (their functions are in their names):
//
//        -  getName(), getter for name.
//
//        -  getTransactions(), getter for transactions.
//
//
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transactions) {
        this.name = name;  // we are initialize this value
        this.transactions = new ArrayList<>();   // we are instantiates this transaction object;
        addTransaction(transactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction){
            transactions.add(transaction);
    }
}
