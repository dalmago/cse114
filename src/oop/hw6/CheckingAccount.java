/*
 * CheckingAccount.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class CheckingAccount extends Account
{
    private double limit;
    public CheckingAccount(){
        this(0,0);
    }

    public CheckingAccount (int id, double balance){
        super(id, balance);
        limit = 0;
    }

    public void setLimit (double limit){
        this.limit = limit;
    }

    public double getLimit(){ return limit;}

    public void withDraw (double amount){
        if (amount > getBalance()+limit){
            System.out.println("There are not enough found to withdraw." +
                    "\nActual balance: "+getBalance()+
                    "\nActual limit: "+getLimit());
        }else{
            setBalance(getBalance()-amount);
        }
    }

    public String toString(){
        return ("Checking account\nID: "+getId()+
                "\nBalance: "+getBalance()+
                "\nLimit: "+getLimit()+
                "\nAnnual Interest Rate: "+getAnnualInterestRate()+
                "\nDate of creation: "+getDateCreated());
    }
}

