package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter two integers, and display the minimum. If the two numbers are equal, display either of them.

Requirements:
•	The program should read the numbers from the keyboard.
•	The program must display a number on the screen.
•	The program should display the minimum of two integers.
•	If the two numbers are equal, display either of them.
 */

import java.util.Scanner;

public class Task04_0418 {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = a < b ? a : b;
        System.out.println(min);
    }
}
