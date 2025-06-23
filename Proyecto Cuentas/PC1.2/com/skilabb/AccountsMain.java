package com.skilabb;

import java.util.*;
import java.util.stream.*;
import com.skilabb.model.*;
import com.skilabb.service.imp.*;


public class AccountsMain{
    public static void main(String[] args){
        Accounts acc = new Accounts();
        System.out.println("Nombre: " + acc.getCustomerName());
        System.out.println("Cuenta: " + acc.getAccountNumber());
        System.out.println("Monto: " + acc.getBalance());
        boolean existe = AccountsImp.validateAccounts(acc);
        if(existe){
            System.out.println("La cuenta existe");
        } else {
            System.out.println("La cuenta no existe");
        }

        acc = new Accounts("Juan","123456789",123.45d);
        System.out.println("Nombre: " + acc.getCustomerName());
        System.out.println("Cuenta: " + acc.getAccountNumber());
        System.out.println("Monto: " + acc.getBalance());
        existe = AccountsImp.validateAccounts(acc);
        if(existe){
            System.out.println("La cuenta existe");
        } else {
            System.out.println("La cuenta no existe");
        }

        acc = new Accounts("Miguel","147258369",0.0d);
        System.out.println("Nombre: " + acc.getCustomerName());
        System.out.println("Cuenta: " + acc.getAccountNumber());
        System.out.println("Monto: " + acc.getBalance());
        existe = AccountsImp.validateAccounts(acc);
        if(existe){
            System.out.println("La cuenta existe");
        } else {
            System.out.println("La cuenta no existe");
        }

        acc = new Accounts("Pedro","32145678",17.0d);
        System.out.println("Nombre: " + acc.getCustomerName());
        System.out.println("Cuenta: " + acc.getAccountNumber());
        System.out.println("Monto: " + acc.getBalance());
        existe = AccountsImp.validateAccounts(acc);
        if(existe){
            System.out.println("La cuenta existe");
        } else {
            System.out.println("La cuenta no existe");
        }
    }

}
