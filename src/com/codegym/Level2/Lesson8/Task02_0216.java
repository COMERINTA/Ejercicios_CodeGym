package com.codegym.Level2.Lesson8;
/* Write a function that computes the minimum of three numbers.

Hint:
You need to write the body of the existing min function.

Requirements:
•	The program should display text on the screen.
•	The min method should not display text on the screen.
•	The main method should call the min method four times.
•	The main method should display the result of the min method. Each time, on a new line.
•	The min method must return the minimum of the numbers a, b, and c.
 */

public class Task02_0216 {
    public static int min(int a, int b, int c) {
        //write your code here
        int m1 = a < b ? a : b;
        int m2 = m1 < c ? m1 : c;

        return m2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}

