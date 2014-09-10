
public class variablesTypes {
	public static void main(String[] args) {
		byte test1 = 127; //1 byte
		byte test9 = -128;
		short test2 = 0;//2 bytes - 16 bits
		int test3 = 0; //32 bits
		long test4 = 0; //64 bits
		float test5 = 0; //32 bits floating point
		double test6 = 0; //64 bits floating point
		char test7 = 'a'; //16 bits
		char test12 = '\u0041'; //unicode
		boolean test8 = true;
		boolean test10 = false;
		String test11 = "slalala";
		
		final double pi = 3.1415;
		
		int test13 = 0xAF;
		
		System.out.println("Pi = " + pi);
		
		System.out.println(test11);
		
		System.out.println(test12);
	}
}
