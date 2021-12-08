package com.codegym.Level3.Lesson1;
/*
Implement public static void div(int a, int b).
The method should divide the first number by the second, and display the result of dividing a by b.
The displayed result should be an integer.

Requirements:
•	The div method must divide a by b.
•	The div method must display the result of the division.
•	The main method should call the div method 3 times.
•	The main method should not call a screen output method.
•	The program should output three numbers: 2 1 0. Each number on a separate line.
 */

public class Task03_0301 {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        //write your code here
        System.out.println(a/b);
    }
}
