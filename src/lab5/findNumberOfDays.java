/*
 * findNumberOfDays.java
 * Copyright (C) 2014 Matheus Dal Mago <matheusdalmago10@hotmail.com>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;

public class findNumberOfDays
{
    public static void main(String[] args) {
        Scanner stdin = new Scanner (System.in);
        System.out.print("Enter the month and the year that you want to know: ");

        int month = stdin.nextInt();
        int year = stdin.nextInt();

        switch (month) {
            case 1:
                System.out.print("January");
                System.out.println(year+" has 31 days");
                break;
            case 2:
                System.out.print("February");
                if ((year%4==0 && year%100 != 0)||year%400==0){
                    System.out.println(year+" has 29 days");
                }
                else{
                    System.out.println(year+" has 28 days");
                }
                break;

            case 3:
                System.out.print("March");
                System.out.println(year+" has 31 days");
                break;
            case 4:
                System.out.print("April");
                System.out.println(year+" has 30 days");
                break;
            case 5:
                System.out.print("May");
                System.out.println(year+" has 31 days");
                break;
            case 6:
                System.out.print("June");
                System.out.println(year+" has 30 days");
                break;
            case 7:
                System.out.print("July");
                System.out.println(year+" has 31 days");
                break;
            case 8:
                System.out.print("August");
                System.out.println(year+" has 31 days");
                break;
            case 9:
                System.out.print("September");
                System.out.println(year+" has 30 days");
                break;
            case 10:
                System.out.print("October");
                System.out.println(year+" has 31 days");
                break;
            case 11:
                System.out.print("November");
                System.out.println(year+" has 30 days");
                break;
            default:
                System.out.print("December");
                System.out.println(year+" has 31 days");
        }
    }
}

