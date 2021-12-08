package com.codegym.Level2.Lesson8;
/* Write a function that computes the minimum of four numbers.
The function min(a, b, c, d) should use (call) the function min(a, b)

Hint:
You need to write the body of the two existing min functions.

Requirements:
•	The program should display text on the screen.
•	The min methods should not display text on the screen.
•	The main method should call min(a, b) and min(a, b, c, d).
•	The main method should display the result of the min methods. Each time, on a new line.
•	The min(a, b) method must return the minimum of the numbers a and b.
•	The min(a, b, c, d) method must use the min(a, b) method.
•	The min(a, b, c, d) method must return the minimum of the numbers a, b, c, and d.
 */

public class Task2_0217 {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        if (min(a, b) < c){
        return (min(a, b) <= d) ? min(a, b) : d;
    } else {
        return (c <= d) ? c : d;

        }
    }

    public static int min(int a, int b) {
        //write your code here
        return (a <= b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}

