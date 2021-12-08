package com.codegym.Level3.Lesson5;
/* Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
        Call it twice in the main method with any arguments.
        Display the results, each time on a new line.

        Requirements:
        •	Add the convertToSeconds method. It must be public static, and take and return ints.
        •	The convertToSeconds method must convert the passed number of hours to seconds.
        •	The main method must call the convertToSeconds method twice.
        •	The main method should display the result of the calls, each time on a new line.
        •	The convertToSeconds method should not display anything.
         */

public class Task03_0312 {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(10));
        System.out.println(convertToSeconds(12));

    }public static int convertToSeconds(int hour) {
        return hour * 60 * 60;
    }
//write your code here


}
