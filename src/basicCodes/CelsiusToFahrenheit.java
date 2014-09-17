/*
 * CelsiusToFahrenheit.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class CelsiusToFahrenheit
{
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }

	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = stdin.nextDouble();
        if (celsius > -273.15)
            System.out.printf("%.2f in Celsius is %.3f in Fahrenheit\n",
                    celsius, celsiusToFahrenheit(celsius));
        else
            System.out.println("The input is not a valid temperature");

	}
}

