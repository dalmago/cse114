/*
 * GetBigWords.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GetBigWords
{

    public static boolean isLetter (char c){
        return ((c>='a' && c<='z')||(c>='A'&& c <= 'Z'));
    }

    public static String[] getBigWords(String s){
        int j = 0;
        int k = 0;
        int words = 0;
        boolean noChar=false;

        for (int i = 0; i<s.length(); i++){
            if (isLetter(s.charAt(i))){
                if (noChar){
                    j = i;
                } else if (i == s.length()-1)
                    k = i+1;
                noChar = false;
            } else{
                if (!noChar){
                    k = i;
                }
                noChar = true;
            }
            if ((noChar || i == s.length()-1) && k-j > 5){
                j = k;
                words++;
            }
            //System.out.println(j + " "+ k);
        }
        //System.out.println(words);

        String[] done = new String[words];
        int index = 0;
        noChar = false;
        j = 0;
        k = 0;

        for (int i = 0; i<s.length(); i++){
            if (isLetter(s.charAt(i))){
                if (noChar){
                    j = i;
                } else if (i == s.length()-1)
                    k = i+1;
                noChar = false;
            } else{
                if (!noChar){
                    k = i;
                }
                noChar = true;
            }
            if ((noChar || i == s.length()-1) && k-j > 5){
                //System.out.println(j + " "+ k);
                done[index] = s.substring(j,k);
                index++;
                j = k;
            }
        }
        return (done);
    }


    public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
        System.out.print("Type the string: ");

        String in = stdin.nextLine();

        String[] out = getBigWords(in);

        for (String i:out){
            System.out.println(i);
        }
    }
}

