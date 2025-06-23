package com.skilabb.service.imp;

import com.skilabb.model.Accounts;

public class AccountsImp{

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
