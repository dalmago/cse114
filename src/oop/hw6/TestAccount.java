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
	}
}

