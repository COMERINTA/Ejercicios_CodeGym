package com.codegym.Level4.Lesson6;
/* Use the keyboard to enter two integers representing the coordinates of a point not on the coordinate axes.
Display the number of the quadrant that contains the given point.

Hint:
Point (a,b) belongs to a quadrant if the following conditions are true:
for the first quadrant: a>0 and b>0;
for the second quadrant: a<0 and b>0;
for the third quadrant: a<0 and b<0;
for the fourth quadrant: a>0 and b<0.

Example for 4 6:
1

Example for -6 -6:
3

Requirements:
•	The program should read the numbers from the keyboard.
•	The program should use System.out.println() or System.out.print().
•	If the point is in the first quadrant, display "1".
•	If the point is in the second quadrant, display "2".
•	If the point is in the third quadrant, display "3".
•	If the point is in the fourth quadrant, display "4".
 */

import javax.swing.*;

public class Task04_0425 {
    public static void main(String[] args){
        //write your code here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));


        if (a>0 && b>0){
            System.out.println(1);
        }else if (a<0 && b>0){
            System.out.println(2);
        }else if (a<0 && b<0){
            System.out.println(3);
        }else if (a>0 && b<0){
            System.out.println(4);
        }
    }
}