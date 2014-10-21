/*
 * TestTime.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class TestTime
{
	public static void main(String[] args) {
        Time t1 = new Time();

        System.out.println("UTC: "+t1.getHour()+" hours, " + t1.getMinute()+
                " minutes, "+t1.getSecond()+" seconds");

        Time t2 = new Time(555550000);

        System.out.println("UTC: "+t2.getHour()+" hours, " + t2.getMinute()+
                " minutes, "+t2.getSecond()+" seconds");
	}
}

