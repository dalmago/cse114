/*
 * Permutation.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;

public class Permutation
{
    public static void perm(String s){
        permutate("", s);
    }

    public static void permutate(String before, String s){
        if (s.length() == 0)
            System.out.println(before);
        else{
            for (int i=0; i<s.length(); i++){
                permutate(before+s.charAt(i), s.substring(0, i)+s.substring(i+1));
            }
        }
    }
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        if (args.length == 1){
            perm(args[0]);
        }
        else{
            System.out.println("Type the string you want to permute: ");
            perm(input.next());
        }
	}
}

