package com.codegym.Level4.Lesson6;
/*Use the keyboard to enter the name and age. If the age is more than 20, display "18 is old enough".

        Requirements:
        •	The program should read lines from the keyboard.
        •	The program should use System.out.println() or System.out.print().
        •	If the age is more than 20, display "18 is old enough" and nothing else.
        •	If the age is less than or equal to 20, don't display anything.

 */

import javax.swing.*;

public class Task04_0423 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name = JOptionPane.showInputDialog("Introduce un nombre");
        String edad = JOptionPane.showInputDialog("Introduce edad");
        int a = Integer.parseInt(edad);

        if ( a > 20){
            System.out.println("18 is old enough");
        }
    }
}
