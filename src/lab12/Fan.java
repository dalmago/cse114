/*
 * Fan.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Fan
{
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    public String color;

    public Fan(){
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public boolean getOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on=on;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        if (on){
            return ("Speed: "+speed+" Color: "+color+" Radius: "+radius);
        }
        else{
            return ("Color: "+color+" Radius: "+radius+" The fan is off");
        }
    }
}

