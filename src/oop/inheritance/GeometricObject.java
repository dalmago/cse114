/*
 * GeometricObject.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public abstract class GeometricObject
{
    private String color;

    public GeometricObject(){
        color= "white";
        System.out.println("constructor of geometricObject");
    }

    public GeometricObject(String color){
        this.color = color;
        System.out.println("second constructor of GeometricObject");
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

