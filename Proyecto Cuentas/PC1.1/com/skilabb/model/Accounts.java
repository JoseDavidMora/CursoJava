package com.skilabb.model;

public class Accounts{
    public String customerName;
    public String accountNumber;
    public double balance;

    public Accounts(){

    }

    public Accounts(String customerName, String accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    {
        customerName = "defaultName";
        accountNumber = "defaultNumber";
        balance = 1.0d;
    }

}
