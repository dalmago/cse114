/*
 * Triangle.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Triangle
{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1(){ return side1;}
    public double getSide2(){ return side2;}
    public double getSide3(){ return side3;}

    public double getArea(){
        double p = (side1+side2+side3)/2;
        return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
    }

    public double getPerimeter(){
        return (side1+side2+side3);
    }

    public String toString(){
        return ("A triangle with sides: "+side1+", "+side2+", "+side3);
    }

    public static void main(String[] args){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(2, 2, 2);
        Triangle t3 = new Triangle (3,4,5);

        System.out.println(t1);
        System.out.println(t2.getArea());
    }
}

