/*
 * ValidatingTriangles.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ValidatingTriangles
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
		System.out.print("Enter the three edges of the triangle ");
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();

        if (a+b>c && a+c>b && b+c>a){
            System.out.print("The triangle is valid and is of the type ");
            if (a == b && a == c && b == c)
                System.out.println("equilateral");
            else if (a == b || a == c || b == c)
                System.out.println("isosceles");
            else
                System.out.println("scalene");
        }
        else{
            System.out.println("The input is not a valid triangle");
        }

	}
}

