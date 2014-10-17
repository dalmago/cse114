/*
 * MyPoint.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyPoint
{
    private double x;
    private double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(MyPoint point){
        double a = Math.pow(this.x - point.x, 2);
        double b = Math.pow(this.y - point.y, 2);

        return (Math.sqrt(a+b));
    }

    public double distance(double x, double y){
        double a = Math.pow(this.x - x, 2);
        double b = Math.pow(this.y - y, 2);

        return (Math.sqrt(a+b));
    }

	public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.printf("First diference: %.3f\n", point1.distance(point2));

        System.out.printf("Second diference: %.3f\n", point2.distance(0, 0));

	}
}
