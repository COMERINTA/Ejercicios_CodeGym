package com.codegym.Level4.Lesson13;
/* Use a for loop to display even numbers from 1 to 100 inclusive.
Display each value on a new line.

Requirements:
•	The program should not read text from the keyboard.
•	The program should display text on the screen.
•	The program should display even numbers from 1 to 100 inclusive. Display each value on a new line.
•	The program must use a for loop
 */

public class Task04_0435 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
