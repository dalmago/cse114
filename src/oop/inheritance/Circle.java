/*
 * Circle.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        this(5.6);
        System.out.println("constructor of Circle");
    }

    public Circle(double l){
        super("black");
        radius = l;
        System.out.println("second constructor of Circle");
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public static void main (String[] args) {
        Circle cr = new Circle(4.2);
        Circle cr2 = new Circle();
    }
}
