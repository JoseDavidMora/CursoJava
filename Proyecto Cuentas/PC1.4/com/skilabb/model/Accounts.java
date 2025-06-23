package com.skilabb.model;

import java.time.*;

public class Accounts{
    private String customerName;
    private String accountNumber;
    private double balance;
    private LocalDate fecha;
    private LocalTime hora;

    public Accounts(){

    }

    public Accounts(String customerName, String accountNumber, double balance){
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
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

    public LocalDate getFecha(){
        return fecha;
    }

    public LocalTime getHora(){
        return hora;
    }

    {
        customerName = "defaultName";
        accountNumber = "defaultNumber";
        balance = 1.0d;
    }

}
