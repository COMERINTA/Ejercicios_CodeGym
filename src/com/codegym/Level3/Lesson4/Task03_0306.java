package com.codegym.Level3.Lesson4;
/* Arrange the brackets correctly (differently) so that the number 382 is displayed on the screen.

Requirements:
•	The program must not read data from the keyboard.
•	The main method must contain only one call to System.out.println.
•	The sequence of digits and arithmetic operations can not be changed.
•	The final expression should have 2 opening and 2 closing parentheses.
•	The main method should display the number 382.
 */

public class Task03_0306 {
    public static void main(String[] args) {
        System.out.println(2 * (3 + 4 * (5 + 6 * 7)));
    }
}
