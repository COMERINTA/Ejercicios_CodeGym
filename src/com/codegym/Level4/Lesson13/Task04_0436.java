package com.codegym.Level4.Lesson13;
/*
Use the keyboard to enter two numbers m and n.
Using a for loop, display an n x m rectangle made of eights.

Here's an example: m=2, n=4
8888
8888

Requirements:
The program should read two numbers from the keyboard.
•	The program should display text on the screen.
•	The program should display a n x m rectangle made of eights.
•	The program must use a for loop.
 */

public class Task04_0436 {
    public static void main(String[] args) {

        int m = 3;
        int n = 4;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('8');
            }

            System.out.println();
    }}}

