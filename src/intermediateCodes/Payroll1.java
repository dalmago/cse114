/*
 * Payroll1.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Payroll1
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        String name =
            JOptionPane.showInputDialog("Type the name of the employee: ");

        double hours = Double.parseDouble(JOptionPane.showInputDialog
            ("Inform the number of hours worked in a week: "));

        double hourlyPayRate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the hourly pay rate  "));

        double federalPercent = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Input the federal tax withholding rate: (%) "));

        double statePercent = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "State tax withholding rate: (%) "));

        double payment = Math.round((hours * hourlyPayRate)*100);
        payment/=100;

        double federalValue = Math.round(federalPercent*payment);
        federalValue/=100;
        double stateValue = Math.round(statePercent*payment);
        stateValue/=100;
        double finalPayment = (payment - federalValue - stateValue);

        String message = "Employee: "+name+"\nHours Worked: "+hours+
            "\nHourly pay rate: $"+hourlyPayRate+"\nTotal without taxes: $"+
            payment+"\nFederal tax withholding rate: $"+federalValue+
            "\nState tax withholding rate: $"+ stateValue+
            "\n\nFINAL payment: $"+finalPayment;

        JOptionPane.showMessageDialog(null, message);
    }
}
