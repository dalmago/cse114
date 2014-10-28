/*
 * SavingAccount.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class SavingAccount extends Account
{
    public SavingAccount(){
        this(0,0);
    }

    public SavingAccount(int id, double balance){
        super(id, balance);
    }

    public String toString(){
        return ("Saving account\nID: "+getId()+
                "\nBalance: "+getBalance()+
                "\nAnnual Interest Rate: "+getAnnualInterestRate()+
                "\nDate of creation: "+getDateCreated());
    }
}

