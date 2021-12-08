package com.codegym.Level4.Lesson13;
/* Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.

Example of screen output:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888

Requirements:
•	The program should not read numbers from the keyboard.
•	The program should display numbers on the screen.
•	The program should display a right triangle of eights, with a base of 10 and a height of 10.
•	The program must use a for loop.
 */

public class Task04_0437 {
    public static void main(String[] args) {
        int a = 10;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j<=i; j++){
                System.out.print('8');
            }
            System.out.println();
        }
    }
}
