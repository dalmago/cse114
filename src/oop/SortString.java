/*
 * SortString.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class SortString
{
    public static String sort(String s){
        char temp;
        char[] array = new char[s.length()];
        String done = "";

        for (int i=0; i<s.length(); i++){
            array[i] = s.charAt(i);
        }

        for (int i=0; i<array.length-1; i++){
            for (int j=i+1;  j<array.length; j++){
                if (array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i<array.length; i++){
            done+=array[i];
        }
        return (done);
    }
}

