// Matheus Dal Mago (110103604)

/*
 * changeMaker.java
 *
 * Code used at the CSE114 class
 *
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class changeMaker {

	public static void main(String[] args) {

        double price, from, change;
        int changeCents; // the change modified to cents
        int hundred, fifty, twenty, ten, five, one, halfDollar, quarter,
            dime, nickels, pennies;

        Scanner input = new Scanner (System.in);

        System.out.print("Price: $");
        price = input.nextDouble();

        System.out.print("From: $");
        from = input.nextDouble();

        change = from - price;

        System.out.printf("Computed change: $%.2f\n", change);

        change = Math.round(change*100);

        changeCents = (int)change;

        //System.out.println(changeCents);

        hundred = changeCents/10000;
        changeCents = changeCents%10000;
        //System.out.println(changeCents);
        fifty = changeCents/5000;
        changeCents = changeCents%5000;
        //System.out.println(changeCents);
        twenty = changeCents/2000;
        changeCents = changeCents%2000;
        //System.out.println(changeCents);
        ten = changeCents/1000;
        changeCents = changeCents%1000;
        //System.out.println(changeCents);
        five = changeCents/500;
        changeCents = changeCents%500;
        //System.out.println(changeCents);
        one = changeCents/100;
        changeCents = changeCents%100;
        //System.out.println(changeCents);
        halfDollar = changeCents/50;
        changeCents = changeCents%50;
        //System.out.println(changeCents);
        quarter = changeCents/25;
        changeCents = changeCents%25;
        //System.out.println(changeCents);
        dime = changeCents/10;
        changeCents = changeCents%10;
        //System.out.println(changeCents);
        nickels = changeCents/5;
        changeCents = changeCents%5;
        //System.out.println(changeCents);
        pennies = changeCents;
        //System.out.println(changeCents);

        System.out.println( hundred + " x $100 bills");
        System.out.println(fifty + " x $50 bills");
        System.out.println(twenty + " x $20 bills");
        System.out.println(ten + " x $10 bills");
        System.out.println(five + " x $5 bills");
        System.out.println(one + " x $1 bills");
        System.out.println(halfDollar + " x 50c coins");
        System.out.println(quarter + " x 25c coins");
        System.out.println(dime + " x 10c coins");
        System.out.println(nickels + " x 5c coins");
        System.out.println(pennies + " x 1c coins");
	}
}
