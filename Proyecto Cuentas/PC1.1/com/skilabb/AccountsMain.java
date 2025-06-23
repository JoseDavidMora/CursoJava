package com.skilabb;

import java.util.*;
import java.util.stream.*;
import com.skilabb.model.*;


public class AccountsMain{
    public static void main(String[] args){
        Accounts acc = new Accounts();
        System.out.println("Nombre: " + acc.customerName);
        System.out.println("Cuenta: " + acc.accountNumber);
        System.out.println("Monto: " + acc.balance);
    }

}
