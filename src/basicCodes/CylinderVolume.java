
import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and the length of a cylinder: ");

		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius*radius*Math.PI;
		double volume = area*length;

		System.out.println("The area of the cylinder is: " + area);
		System.out.println("The volume of the cylinder is: " + volume);
	}

}
