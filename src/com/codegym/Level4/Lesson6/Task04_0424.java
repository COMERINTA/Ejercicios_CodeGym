package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter three integers. One of the numbers is unique. The other two are identical. Display the ordinal number of the number that is different from the others.
Example for 4 6 6:
1

Example for 6 6 3:
3

Requirements:
•	The program should read the numbers from the keyboard.
•	The program should use System.out.println() or System.out.print().
•	The program should display the ordinal number of the number that is different from the others.
•	If all the numbers are different, don't display anything.
 */

import javax.swing.*;

public class Task04_0424 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));

        if (num1 == num2 && num1 == num3 && num2 == num3) {
        } else {
            if (num1 == num2) {
                System.out.println(num3);
            } else {
                if (num2 == num3) {
                    System.out.println(num1);
                } else if (num1 == num3) {
                    System.out.println(num2);
                }
            }
        }
    }
}
