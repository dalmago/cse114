// Matheus Dal Mago (110103604)

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		
		double celsius = input.nextDouble();
		
		double fahrenheit = celsius*(9.0/5) + 32;
		
		System.out.println(celsius + " in Celsius is " + fahrenheit + 
				" in Fahrenheit");
	}

}
