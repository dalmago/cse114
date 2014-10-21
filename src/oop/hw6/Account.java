/*
 * Account.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new java.util.Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new java.util.Date();
    }

    public int getId(){ return id;}
    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){ return balance;}
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){ return annualInterestRate;}
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public java.util.Date getDateCreated(){ return dateCreated;}

    public double getMonthlyInterestRate(){ return annualInterestRate/12;}

    public void withDraw(double amount){
        if (amount > balance){
            System.out.println("There are not enough founds to withdraw."+
                    "\nActual balance: "+balance);
        } else{
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public String toString(){
        return ("ID: "+id+"\nBalance: "+balance+"\nAnnual Interest Rate: "+
                annualInterestRate+"\nDate of creation: "+dateCreated);
    }
}

