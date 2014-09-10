// Matheus Dal Mago (110103604)

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type a Fahrenheit degree: ");
		
		double fahrenheit = input.nextDouble();
		
		double celsius = (fahrenheit-32)*(5.0/9);
		
		System.out.println("The celsius degree is " + celsius);
	}

}
