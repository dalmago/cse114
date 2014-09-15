/*
 * strings.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class strings
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String message = "Welcome to Java";

        System.out.println("The first character in message is " +
                message.charAt(0));

        System.out.print("The length of the string is " + message.length()
                + "\nType the index: ");

        int i = input.nextInt();

        System.out.println("The character is: " +
                message.charAt(i));




	}
}
