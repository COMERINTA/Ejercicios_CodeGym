package com.codegym.Level3.Lesson8;
/* Use the keyboard to enter three names, then display:
name1 + name2 + name3 = Pure love. Ooo la-la!

For example:
Kevin + Eva + Angelica = Pure love. Ooo la-la!

Requirements:
•	The program should output text.
•	The program must read data from the keyboard.
•	The displayed text must contain the entered name1.
•	The displayed text must contain the entered name2.
•	The displayed text must contain the entered name3.
•	The displayed text must fully match the task conditions.
 */

import javax.swing.*;

public class Task03_0322 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name = JOptionPane.showInputDialog("Introduce nombre");
        String name2 = JOptionPane.showInputDialog("Introduce nombre");
        String name3 = JOptionPane.showInputDialog("Introduce nombre");

        System.out.println(name + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
    }
}
