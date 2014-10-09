/*
 * SumMajorDiagonal.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SumMajorDiagonal
{
	public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        int n = Integer.parseInt
            (JOptionPane.showInputDialog("Type the dimension of the matrix"));

        double[][] matrix = new double[n][n];

        System.out.println("Type the elements of the matrix, row by row:");
        for (int i = 0; i<n;i++){
            System.out.print("Row "+i+": ");
            for (int j=0; j<n; j++){
                matrix[i][j] = stdin.nextDouble();
            }
        }

        System.out.printf("Sum of the major diagonal: %.2f ",
                sumMajorDiagonal(matrix));
	}

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                if (i==j)
                    sum+=m[i][j];
            }
        }
        return sum;
    }
}

