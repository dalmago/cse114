/*
 * BubbleSort.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

//import java.util.Scanner;
//import javax.swing.JOptionPane;

public class BubbleSort
{
	public static void main(String[] args) {
        //Scanner stdin = new Scanner (System.in);

        double[] list = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};

        bubbleSort(list);

        for (double i:list)
            System.out.print(i+" ");
        System.out.println();

	}

    public static void bubbleSort(double[] list){
        double temp;

        for (int i=0; i<list.length; i++){
            for (int j=i+1; j<list.length; j++){
                if (list[j] < list[i]){
                    temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }

            }
        }

    }
}

