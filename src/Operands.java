
public class Operands {

	public static void main(String[] args) {
		int x = 1;
		
		if ((x > 1) & (x++ < 10)); //run both, independent of the condition
		System.out.println(x);

		x = 1;
		if ((x > 1) && (x++ < 10)); //if the first is false, do not run the second condition
		System.out.println(x);
		
		x = 1;
		if ((x == 1) | (x++ < 10)); //run both, independent of the condition
		System.out.println(x);
		
		x = 1;
		if ((x == 1) || (x++ < 10)); //if the first is true, do not run the second condition
		System.out.println(x);
	}

}
