/*
 * OccurrenceNumber.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

//import java.util.Scanner;
//import javax.swing.JOptionPane;

public class OccurrenceNumber
{
    public static int[] count(String s){
        int[] occurrence = new int[10];

        for (int i=0; i<s.length(); i++){
            occurrence[(int)s.charAt(i)-(int)'0']++;
        }
        return occurrence;
    }
	public static void main(String[] args) {
        String s = "1234567890987";

        for (int i:count(s)){
            System.out.print(i + " ");
        }
        System.out.println();

	}
}

