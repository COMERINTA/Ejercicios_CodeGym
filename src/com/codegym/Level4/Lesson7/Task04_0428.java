package com.codegym.Level4.Lesson7;
/* Use the keyboard to enter three integers. Display the number of positive numbers in the original set.

Here are some examples:
a) if you enter the numbers
-4
6
6
then we display
2

b) if you enter the numbers
-6
-6
-3
then we display
0

c) if you enter the numbers
0
1
2
then we display
2

Requirements:
The program should read the numbers from the keyboard.
The program must display a number on the screen.
The program should display the number of positive numbers in the original set.
If there are no positive numbers, the program should display "0".
Note that 0 is not a positive or negative number.
 */

import javax.swing.*;

public class Task04_0428 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int cont = 0;
        if (a > 0) {
            cont++;
        }
        if (b > 0) {
            cont++;
        }
        if (c > 0) {
            cont++;
        }
        System.out.println(cont);
    }
}



