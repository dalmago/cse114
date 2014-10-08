/*
 * DulpicateArraySize.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

//import java.util.Scanner;
//import javax.swing.JOptionPane;

public class DulpicateArraySize
{
	public static void main(String[] args) {
        //Scanner stdin = new Scanner (System.in);

        int[] list = {1,2,3,4,5};

        for (int i:doubleCapacity(list))
            System.out.print(i+" ");
    System.out.println();
	}

    public static int[] doubleCapacity(int[] list){
        int[] list2 = new int[list.length*2];

        for (int i=0; i<list.length; i++){
            list2[i] = list[i];
        }
        return list2;
    }
}

