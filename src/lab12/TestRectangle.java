/*
 * TestRectangle.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class TestRectangle
{
	public static void main(String[] args) {
        Rectangle r1 = new Rectangle (4, 40);
        Rectangle r2 = new Rectangle (3.5, 35.9);

        r1.setColor("red");
        r2.setColor("red");

        System.out.println("First width: "+r1.getWidth());
        System.out.println("First height: "+r1.getHeight());
        System.out.println("First Color: "+r1.getColor());
        System.out.println("First Area: "+r1.getArea());
        System.out.println("First Perimeter: "+r1.getPerimeter());

        System.out.println("Second width: "+r2.getWidth());
        System.out.println("Second height: "+r2.getHeight());
        System.out.println("Second Color: "+r2.getColor());
        System.out.println("Second Area: "+r2.getArea());
        System.out.println("Second Perimeter: "+r2.getPerimeter());
	}
}

