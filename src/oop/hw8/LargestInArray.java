/*
 * LargestInArray.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;

public class LargestInArray
{

    public static int largest(int[] array, int i){
       if (i == array.length-1)
            return array[i];

       int x = largest(array, i+1);

       if (x > array[i])
           return x;
       else
           return array[i];
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the size of the vector: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Type the "+ n + " elements: ");
        for (int i=0; i<n; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Largest: "+largest(array, 0));
    }
}

