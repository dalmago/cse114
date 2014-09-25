/*
 * CheckingISBN.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CheckingISBN
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
		int value;
        int[] isbn = new int[9];
        int checksum = 0;

        System.out.print("Enter the number to ckeck: ");
        value = stdin.nextInt();

        for (int i = 8; i>=0; i--){
            isbn[i] = value%10;
            checksum+=isbn[i]*(i+1);
            value /= 10;
        }

        checksum = checksum%11;

        System.out.print("The correct ISBN number is ");
        for (int i=0; i<9; i++){
            System.out.print(isbn[i]);
        }
        if (checksum != 10)
            System.out.println(checksum);
        else
            System.out.println("X");




    }
}

