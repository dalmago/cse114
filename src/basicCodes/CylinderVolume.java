import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius and the length of a cylinder: ");

		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius*radius*Math.PI;
		double volume = area*length;

		System.out.printf("The area of the cylinder is: %.4f\n", area);
		System.out.printf("The volume of the cylinder is: %.1f\n",  volume);
	}

}
