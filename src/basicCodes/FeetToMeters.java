import java.util.Scanner;

public class FeetToMeters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value in feet: ");

		double feet = input.nextDouble();

		System.out.printf("%.2f feet is %.2f  meters\n", feet, (feet*0.305));

	}

}
