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

        for (int i=binaryValue.length()-1, j=0; i>=0; i--, j++){
            int value = (int)binaryValue.charAt(i)-(int)'0';
            quarter+= value*Math.pow(16, j);
            if ((j+1)%4 == 0){
                hexValue = ((char)quarter+(char)0) + hexValue;
                quarter = 0;
            }

        }
        return hexValue;
    }

	public static void main(String[] args) {
        System.out.println("hex: "+binaryToHex("1001"));

	}
}

