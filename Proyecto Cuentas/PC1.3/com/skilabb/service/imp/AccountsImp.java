package com.skilabb.service.imp;

import com.skilabb.model.Accounts;
import java.util.*;

public class AccountsImp{
    private ArrayList<Accounts> cuentas = new ArrayList<Accounts>();
    private int len = 0;

    public void AccountsImp(){
    }

    public void generateAccounts(String customerName,String accountNumber,double balance){
        if(this.len == 3){
            System.out.println("Ya se tienen 3 cuentas");
            return;
        }
        Accounts acc = new Accounts(customerName,accountNumber,balance);
        this.cuentas.add(acc);
        this.len += 1;
    }

    public ArrayList<Accounts> getCuentas(){
        return this.cuentas;
    }

    public static boolean validateAccounts(Accounts acc){
        String accountNumber = acc.getAccountNumber();
        double balance = acc.getBalance();
        if(balance <= 0.0d){
            return false;
        }
        if(accountNumber.equals("32145678")){
            return false;
        }
        return true;
    }

}
