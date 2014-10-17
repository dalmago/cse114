/*
 * OccurrenceNumber.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class OccurrenceNumber
{
    public static int[] count(String s){
        int[] occurrence = new int[10];

        for (int i=0; i<s.length(); i++){
            occurrence[(int)s.charAt(i)-(int)'0']++;
        }
        return occurrence;
    }
}

