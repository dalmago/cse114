/*
 * Payroll1.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class Payroll2
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        System.out.print("Type the name of the employee: ");
        String name = stdin.next();

        System.out.print("Inform the number of hours worked in a week: ");
        double hours = stdin.nextDouble();

        System.out.print("Enter the hourly pay rate  ");
        double hourlyPayRate = stdin.nextDouble();

        System.out.print("Input the federal tax withholding rate: (%) ");
        double federalPercent = stdin.nextDouble();

        System.out.print("State tax withholding rate: (%) ");
        double statePercent = stdin.nextDouble();

        double payment = Math.round((hours * hourlyPayRate)*100);
        payment/=100;

        //double federalValue = federalPercent*payment/100;
        //double stateValue = statePercent*payment/100;

        double federalValue = Math.round(federalPercent*payment);
        federalValue/=100;
        double stateValue = Math.round(statePercent*payment);
        stateValue/=100;
        double finalPayment = Math.round((payment - federalValue -
                    stateValue)*100);
        finalPayment/=100;

        System.out.println("\nEmployee: " + name);
        System.out.println("Hours worked: "+ hours);
        System.out.println("Hourly pay rate: " + hourlyPayRate);
        System.out.println("Total without taxes: $" + payment);
        System.out.println("Federal tax withholding rate: (%)" +
                federalPercent);
        System.out.println("Federal tax withholding rate: $"+federalValue);
        System.out.println("State tax withholdinh rate: (%)" + statePercent);
        System.out.println("State tax withholding rate: $" + stateValue);
        System.out.println("\nFINAL payment: $"+finalPayment);

	}
}

