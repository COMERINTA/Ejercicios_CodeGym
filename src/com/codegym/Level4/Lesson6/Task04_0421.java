package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter two names. If the names are identical, display "The names are identical".
If the names are different, but they are the same length, display "The names are the same length".
If the names and name lengths are different, don't display anything.

Requirements:
•	The program should read two lines from the keyboard.
•	The program should contain System.out.println() or System.out.print().
•	If the names are identical, display "The names are identical"
•	If the names are different, but they are the same length, display "The names are the same length"
•	If the names and name lengths are different, don't display anything.
 */

import javax.swing.*;

public class Task04_0421 {
    public static void main(String[] args) {
        //write your code here

        String name1 = JOptionPane.showInputDialog("Introduce un nombre");
        String name2 = JOptionPane.showInputDialog("Introduce un nombre");

        int a = name1.length();
        int b = name2.length();

        if (name1.equals(name2)) {
            System.out.println("The names are identical");
        }else if (a == b){
            System.out.println("The names are the same length");
        }

        }
    }

