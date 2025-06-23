package com.skilabb;

import java.util.*;
import java.util.stream.*;
import com.skilabb.model.*;
import com.skilabb.service.imp.*;


public class AccountsMain{
    public static void main(String[] args){
        AccountsImp cuentas = new AccountsImp();
        boolean existe;

        cuentas.generateAccounts("Miguel","147258369",0.0d);
        cuentas.generateAccounts("Juan","123456789",123.45d);
        cuentas.generateAccounts("Pedro","32145678",17.0d);

        for(Accounts temp: cuentas.getCuentas()){
            System.out.println("Nombre: " + temp.getCustomerName());
            System.out.println("Cuenta: " + temp.getAccountNumber());
            System.out.println("Monto: " + temp.getBalance());
            System.out.println("Fecha: " + temp.getFecha());
            System.out.println("Hora: " + temp.getHora());
            existe = AccountsImp.validateAccounts(temp);
            if(existe){
                System.out.println("La cuenta existe\n");
            } else {
                System.out.println("La cuenta no existe\n");
            }
        }
    }

}
