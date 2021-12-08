package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter four numbers, and display the maximum of them. If the maximum occurs more than once, just display it once.

Requirements:
•	The program should read the numbers from the keyboard.
•	The program must display a number on the screen.
•	The program should display the maximum of four numbers.
•	If there are several maximum numbers, display any of them.
 */

import java.util.Scanner;

public class Task04_0419 {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int z = (a > b ? a : b);
    int y = ( c > d ? c : d);

    int max = z > y ? z : y;
            System.out.println (max);
    }
}