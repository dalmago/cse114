/*
 * YoungMcJava.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class YoungMcJava
{
    public static void tartan(int n, int i, int j){
        if (j > n){
            j = 1;
            i++;
            System.out.println();
        }
        if (i > n) return;
        System.out.print(((i+j)%2==0?n:n-1)+" ");
        tartan(n, i, j+1);
    }
    public static void main(String[] args) {
        tartan(Integer.parseInt(args[0]), 1, 1);
    }
}

