package com.codegym.Level4.Lesson7;
/* Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
"even single-digit number" - if the number is even and has one digit,
"odd single-digit number" - if the number is odd and has one digit,
"even two-digit number" - if the number is even and has two digits,
"odd two-digit number" - if the number is odd and has two digits,
"even three-digit number" - if the number is even and has three digits,
"odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.

Example for 100:
even three-digit number

Example for 51:
odd two-digit number

Requirements:
The program should read one number from the keyboard.
The program should use System.out.println() or System.out.print()..
If the number is even and has one digit, display "even single-digit number".
If the number is odd and has one digit, display "odd single-digit number".
If the number is even and has two digits, display "even two-digit number".
If the number is odd and has two digits, display "odd two-digit number".
If the number is even and has three digits, display "even three-digit number".
If the number is odd and has three digits, display "odd three-digit number".
If the entered number doesn't fall in the range 1 - 999, don't display anything
The program should display a string description of the number and nothing else.
 */

import javax.swing.*;

public class Task04_0427 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));

        if  ( a < 10 && a %2 == 0) {
            System.out.println("odd single-digit number");
        }else if ( a < 10 && a %2 == 1) {
            System.out.println("even single-digit number");
        }else if ( a > 9 && a < 100 &&a %2 == 0) {
            System.out.println("odd two-digit number");
        }else if ( a > 9 && a < 100 && a %2 == 1) {
            System.out.println("even two-digit number");
        }else if ( a > 99 && a < 1000 &&a %2 == 0) {
            System.out.println("odd two-digit number");
        }else if ( a > 99 && a < 1000 && a %2 == 1) {
            System.out.println("even two-digit number");
        }
    }
}
