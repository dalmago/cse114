/*
 * CalculateTip.java
 *
 * Code used at the CSE114 class
 *
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class CalculateTip
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the subtotal: ");

        double subtotal = input.nextDouble();

        double tip, total;

        if (subtotal < 30.0){
            tip = 5.0;
        } else {
            tip = subtotal*0.15;
        }
        total = subtotal + tip;

        System.out.printf("The gratuity is $%.2f and the total is $%.2f\n",
                tip, total);

	}
}

