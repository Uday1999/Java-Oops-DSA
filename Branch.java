package com.udemy.challenges;




import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;  //adding customers in this area

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {

        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, transaction));
            return true;
        }
        return false;
    }


//    addCustomerTransaction(), has two parameters of type String (name of customer),
//    double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully
//    or false otherwise.


    public boolean addCustomerTransaction(String CustName, double transaction){

        Customer existingCustomer = findCustomer(CustName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }

        return false;
    }




    public Customer findCustomer(String CustName) {

        for (Customer cust : customers) {
            if (cust.getName().equals(CustName)) {
                return cust;
            }
        }
        return null;
    }


}
