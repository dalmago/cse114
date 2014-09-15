/*
 * Sorting_3.java
 * Copyright (C) 2014 Matheus Dal Mago >matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class Sorting_3
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        System.out.print("Enter 3 numbers: ");
        int num1=stdin.nextInt(),
            num2=stdin.nextInt(),
            num3=stdin.nextInt();
        int temp;

        if (num1>num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1>num3){
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num2>num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1+" >= "+num2+" >= "+num3);
	}
}

