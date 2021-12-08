package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter three numbers, and display them in descending order.
The displayed numbers must be separated by spaces.

Requirements:
•	The program should read the numbers from the keyboard.
•	The program should display numbers on the screen.
•	The program should display three numbers separated by spaces.
•	The program should display the numbers in descending order.
 */

import java.util.Scanner;

public class Task04_0420 {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }else if
            (b <= a && b <= c){
            if (a <= c){
                System.out.println(c + " " + a + " " + b);
            }else {
                System.out.println(a + " " + c + " " + b);
            }
        }else{
            if (a <= b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }

        }
    }
}
