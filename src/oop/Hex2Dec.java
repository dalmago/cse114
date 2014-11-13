/*
 * Hex2Dec.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Hex2Dec
{
	public static void main(String[] args) throws HexFormatException {
        System.out.println(parseHex("FAA"));
	}

    public static int parseHex(String hexString) throws HexFormatException{
        int value = convertHexToDec(hexString.charAt(0));
        for (int i=1; i<hexString.length(); i++){
            value = value*16+convertHexToDec(hexString.charAt(i));
        }
        return value;
    }

    static int convertHexToDec(char ch) throws HexFormatException{
        if (ch >= 'A' && ch <= 'F') return ch-'A'+10;
        else if (ch <= '9' && ch >= '0') return ch-'0';
        else
            throw new HexFormatException("Illegal hex character: "+ch);
    }
}

class HexFormatException extends Exception{
    HexFormatException(){
        super("Illegal hex character");
    }
    HexFormatException(String s){
        super(s);
    }
}

