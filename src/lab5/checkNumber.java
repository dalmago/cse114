/*
 * checkNumber.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class checkNumber
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
		System.out.print("Enter an integer to be checked: ");

        int number = stdin.nextInt();

        System.out.print("The number "+number+" is divisible by ");

        if (number%5 == 0 && number%6 == 0) {
            System.out.println("both 5 and 6");
        }
        else if (number%5 == 0) {
            System.out.println("5");
        }
        else if (number%6 == 0) {
            System.out.println("6");
        }
        else
            System.out.println("neither of them");
	}
}

