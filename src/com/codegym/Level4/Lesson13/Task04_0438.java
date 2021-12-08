package com.codegym.Level4.Lesson13;
/* Using a for loop to display:
- a horizontal line of 10 eights
- a vertical line of 10 eights (do not count any of the eights in the horizontal line as part of this vertical line).

Requirements:
The program should not read numbers from the keyboard.
The program should display numbers on the screen.
The program should display a horizontal line of 10 eights.
The program should display a vertical line of 10 eights.
The program must use a for loop.
 */

public class Task04_0438 {
    public static void main(String[] args) {
        int a = 10;

        for (int i=0; i < a; i++) {
            System.out.print('8');
        }
        for (int i=0; i<a; i++) {
            System.out.println('8');
        }
    }
}
