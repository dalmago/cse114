/*
 * Rectangle.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Rectangle
{
    private double width;
    private double height;
    private String color;


    public Rectangle(){
        width = 1;
        height = 1;
        color = "white";
    }

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double getArea(){
        return (width*height);
    }

    public double getPerimeter(){
        return (2*width+2*height);
    }
}

