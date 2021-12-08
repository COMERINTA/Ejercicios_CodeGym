package com.codegym.Level4.Lesson10;
/* Use the keyboard to enter a string and a number N greater than 0.
Use a while loop to display the string N times. Each value should be on a new line.

Example input:
abc
2

Example output:
abc
abc

Requirements:
The program should read the text from the keyboard.
The program should display text on the screen.
Each value should be displayed on a new line.
The program should display the string N times.
The program must use a while loop.
 */

import javax.swing.*;

public class Task04_0432 {
    public static void main(String[] args) throws Exception {

        String name = JOptionPane.showInputDialog("Introduce un nombre");
        int i = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));


        while (i > 0)
        {
            System.out.println(name);
            i--;
        }
    }
}
