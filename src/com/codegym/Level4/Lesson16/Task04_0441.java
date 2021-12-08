package com.codegym.Level4.Lesson16;
/* Use the keyboard to enter three numbers, and then display the middle number.
In other words, not the largest and not the smallest.
If all the numbers are equal, display any one of them.

Requirements:
The program should read the numbers from the keyboard.
The program must display a number on the screen.
The program should display the middle number of the three numbers.
If all the numbers are equal, display any one of them.
If two of the three numbers are equal, display either of the two.
 */

public class Task04_0441 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 10;

        if ((a >= b && a <= c) || (a <= b && a >= c)){
            System.out.println(a);
        }
        if ((b >= a && b <= c) || (b <= a && b >= c)){
            System.out.println(b);
        }
        if ((c >= b && c <= a) || (c <= b && c >= a)){
            System.out.println(c);
        }
    }
}
