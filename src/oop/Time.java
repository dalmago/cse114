/*
 * Time.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Calendar;

public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time(){
        Calendar cal = Calendar.getInstance();
        hour = (cal.get(Calendar.HOUR_OF_DAY)+4)%24;   // Transform to UTC
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);
    }

    public Time(long elapseTime){
        long totalSeconds = elapseTime/1000;
        second = (int)(totalSeconds%60);
        long totalMinutes = totalSeconds/60;
        minute = (int)(totalMinutes%60);
        long totalHours = totalMinutes/60;
        hour = (int)(totalHours%24);
    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){ return hour;}
    public int getMinute(){ return minute;}
    public int getSecond(){ return second;}

    public void setTime(long elapseTime){
        long totalSeconds = elapseTime/1000;
        second = (int)(totalSeconds%60);
        long totalMinutes = totalSeconds/60;
        minute = (int)(totalMinutes%60);
        long totalHours = totalMinutes/60;
        hour = (int)(totalHours%24);
    }
}

