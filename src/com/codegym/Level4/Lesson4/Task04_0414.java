package com.codegym.Level4.Lesson4;
/* Use the keyboard to enter a year, and then determine the number of days in the year. Display the result as follows:
Number of days in the year: x
, where
x is 366 for a leap year, and
x is 365 for an ordinary year.

Hint:
A leap year is 366 days, but an ordinary year is 365 days.
1) if the year is evenly divisible by 400, then it is a leap year;
2) for other years, if the year is evenly divisible by 100, then it is a regular year;
3) for other years, if the year is evenly divisible by 4, then it is a leap year;
4) all remaining years are not leap years.
Thus, the years 1700, 1800, and 1900 are not leap years, since they are multiples of 100 but not 400.
The years 1600 and 2000 are leap years, since they are multiples of 100 and multiples of 400.
The years 2100, 2200 and 2300 are not leap years.

Requirements:
The program should read a number from the keyboard.
The program should display text on the screen according to the task conditions.
If the entered year is a leap year, you should display: "Number of days in the year: 366".
If the entered year is not a leap year, you should display: "Number of days in the year: 365".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04_0414 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(reader.readLine());

        if (days % 4 == 0) {
            if ((days % 100 == 0) && (days % 400 != 0)) {
                days = 365;
            } else {
                days = 366;
            }
        } else {
            days = 365;
        }

        System.out.println("Number of days in the year: " + days);
    }
}
