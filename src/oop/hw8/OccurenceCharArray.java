/*
 * OccurenceCharArray.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class OccurenceCharArray
{
    public static int count(char[] chars, char ch){
        return count(chars, ch, chars.length-1);
    }

    public static int count(char[] chars, char ch, int high){
        if (high == -1)
            return 0;

        if (chars[high] == ch)
            return 1+count(chars, ch, high-1);
        else
            return count(chars, ch, high-1);
    }

	public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'a', 'a', 'd'};

        System.out.println("Number of occurences: "+count(chars, 'a'));
	}
}

