/*
 * ParseBinary.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

class BinaryFormatException extends Exception{
    public BinaryFormatException(String s){
        super("Illegal binary format: "+s);
    }
}


public class ParseBinary{
    public static int parseBinary (String binary) throws BinaryFormatException{
        if (!binary.matches("[01]*"))
            throw new BinaryFormatException(binary);

        //int ans = 0;
        //for (int i=binary.length()-1; i>=0; i--){
            //ans+= (binary.charAt(i)-'0')*Math.pow(2, binary.length()-i-1);
        //}

        return Integer.parseInt(binary);
    }

    public static void main (String[] args) {
        if (args.length == 0){
            System.out.println("Use some arguments for conversion");
            System.exit(1);
        }

        for (int i=0; i<args.length; i++){
            try{
                System.out.println("Binary String "+args[i]+
                        " in integer: "+parseBinary(args[i]));
            } catch (BinaryFormatException ex){
                System.out.println(ex);
            }
        }

    }
}
