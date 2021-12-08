package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter the name and age. If the age is less than 18, display "Grow up a little more".

        Requirements:
        The program should read data from the keyboard twice.
        The program should use System.out.println() or System.out.print().
        If the age is less than 18, display "Grow up a little more" and nothing else.
        If the age is greater than or equal to 18, don't display anything.
 */

import javax.swing.*;

public class Task04_0422 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name = JOptionPane.showInputDialog("Introduce el nombre");
        String edad = JOptionPane.showInputDialog("Introduce el nombre");
        int a = Integer.parseInt(edad);

        if (a < 18) {
            System.out.println ("Grow up a little more");
        }
    }
}
