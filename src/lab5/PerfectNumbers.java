/*
 * isPerfect.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class PerfectNumbers
{
    public static void isPerfect(int upper){
        int i, j;
        int soma;

        System.out.println("Looking for perfect numbers from 1 to "+ upper);

        for (i=2; i<=upper; i++){
            soma = 0;
            for (j=1; j<i; j++) {
                if (i%j == 0){
                    soma+=j;
                }
            }
            if (soma == i){
                System.out.print(i + " is a perfect number it's factors"
                        + " are: ");
                for (j=1; j<i; j++){
                    if (i%j == 0)
                        System.out.print(j+ " ");

                }
                System.out.print("\n");
            }

        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);

        System.out.print("Enter the number up to which you would like to"+
                " look for perfect numbers:");

        int upper = stdin.nextInt();

        isPerfect(upper);
    }
}
