package com.codegym.Level4.Lesson4;
/* Write the compare(int a) method so that it:
- displays "The number is less than 5" if the method argument is less than 5,
- displays "The number is greater than 5" if the method argument is greater than 5,
- displays "The number is equal to 5" if the method argument is equal to 5.

Requirements:
The program should display text on the screen.
The main method should not call System.out.println or System.out.print.
The main method should call the compare method.
The compare method must be void.
The compare method should display text on the screen in accordance with the task conditions.
 */

public class Task04_0408 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //write your code here
        if (a < 5) {
            System.out.println("The number is less than 5");
        } else if (a > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is equal to 5");
        }
    }
}

