/*
 * Hex.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class Hex
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a decimal value  (0 to 15): ");

        int dec = input.nextInt();

        char c = (dec>=0 && dec <=9)? (char)(dec+'0'):
            (dec<=15)? (char)(dec-10+'A'):'i';

        if (c == 'i') System.out.println("Invalid input");
        else System.out.println("The hex value  is " + c);
	}
}

