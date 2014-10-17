/*
 * BinaryToHex.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class BinaryToHex
{

    public static String binaryToHex(String binaryValue){
        String hexValue="";
        int quarter = 0;
        int value;

        for (int i=binaryValue.length()-1, j=0; i>=0; i--){
            value = (int)binaryValue.charAt(i)-(int)'0';
            quarter+= value*Math.pow(2, j);
            //System.out.println(quarter);
            if (((j++)+1)%4 == 0 || i == 0){
                if (quarter >= 10){
                    hexValue = ((char)(quarter-10+(int)'A')) + hexValue;
                }
                else{
                    hexValue = ((char)quarter+(char)0) + hexValue;
                }
                quarter = 0;
                j = 0;
            }
            //j++;

        }
        return hexValue;
    }
}

