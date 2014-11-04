/*
 * TestAccount.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class TestAccount
{
	public static void main(String[] args) {
        Account ac1 = new Account(1122, 20000);

        ac1.setAnnualInterestRate(4.5);
        ac1.withDraw(2500);
        ac1.deposit(3000);

        System.out.println(ac1.toString());

        System.out.println("Monthly Interest Rate: "+
                ac1.getMonthlyInterestRate());


        CheckingAccount ac2 = new CheckingAccount(1234, 40000);
        ac2.setLimit(2000);

        System.out.println();

        SavingAccount ac3 = new SavingAccount(4321, 30000);

        System.out.println(ac2.toString());

        System.out.println();

        System.out.println(ac3.toString());
        System.out.println();
        ac3.withDraw(45000);
	}
}

