/*
 * MyInteger.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class MyInteger
{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){return value;}

    public boolean isEven(){return value%2==0;}
    public boolean isOdd(){return value%2==1;}
    public boolean isPrime(){
        for (int i=2; i<value; i++){
            if (value%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int value){return value%2==0;}
    public static boolean isOdd(int value){return value%2==1;}
    public static boolean isPrime(int value){
        for (int i=2; i<value; i++){
            if (value%i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger value){return value.value%2==0;}
    public static boolean isOdd(MyInteger value){return value.value%2==1;}
    public static boolean isPrime(MyInteger value){
        for (int i=2; i<value.value; i++){
            if (value.value%i == 0)
                return false;
        }
        return true;
    }

    public boolean equals(int value){return (value==this.value);}
    public boolean equals(MyInteger value){return (value.value==this.value);}

    public static int parseInt(String s){
        int value=0;

        for (int i=0; i<s.length(); i++){
            value+= ((int)s.charAt(i)-(int)'0')*Math.pow(10,s.length()-1-i );
        }
        return value;
    }
}
