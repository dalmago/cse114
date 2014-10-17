/*
 * TestMyInteger.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class TestMyInteger
{
	public static void main(String[] args) {
        MyInteger int1 = new MyInteger(4);
        MyInteger int2 = new MyInteger(5);

        System.out.println("Object 1: "+int1.getValue());
        System.out.println("Object 2: "+int2.getValue());

        if (int1.isEven())
            System.out.println("Object 1 is even");
        if (int1.isOdd())
            System.out.println("Object 1 is odd");
        if (int1.isPrime())
            System.out.println("Object 1 is prime");

        if (int2.isEven())
            System.out.println("Object 2 is even");
        if (int2.isOdd())
            System.out.println("Object 2 is odd");
        if (int2.isPrime())
            System.out.println("Object 2 is prime");

        if (MyInteger.isEven(4))
            System.out.println("4 is even");
        if (MyInteger.isOdd(5))
            System.out.println("5 is odd");
        if (MyInteger.isPrime(7))
            System.out.println("7 is prime");

        if (MyInteger.isEven(int1))
            System.out.println("Object 1 is even");
        if (MyInteger.isOdd(int1))
            System.out.println("Object 1 is odd");
        if (MyInteger.isPrime(int1))
            System.out.println("Object 1 is prime");

        if (MyInteger.isEven(int2))
            System.out.println("Object 2 is even");
        if (MyInteger.isOdd(int2))
            System.out.println("Object 2 is odd");
        if (MyInteger.isPrime(int2))
            System.out.println("Object 2 is prime");

        if(int1.equals(4))
            System.out.println("Object 1 is equal to 4");
        if ( ! int1.equals(int2))
            System.out.println("Object 1 is not equal to object 2");

        System.out.println("Value 450 from string to int: "+
                MyInteger.parseInt("450"));
	}
}

