/*
 * Palindrome.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a three-digit integer: ");

        String number = input.next();

        if (number.charAt(0) == '-'){
            if (number.charAt(1) == number.charAt(3))
                System.out.println(number + " is a palindrome");
            else
                System.out.println(number + " is not a palindrome");
        }
        else if (number.charAt(0) == number.charAt(2))
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");

    }
}

