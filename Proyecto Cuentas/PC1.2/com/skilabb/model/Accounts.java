package com.skilabb.model;

public class Accounts{
    private String customerName;
    private String accountNumber;
    private double balance;

    public Accounts(){

    }

    public Accounts(String customerName, String accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    {
        customerName = "defaultName";
        accountNumber = "defaultNumber";
        balance = 1.0d;
    }

}
