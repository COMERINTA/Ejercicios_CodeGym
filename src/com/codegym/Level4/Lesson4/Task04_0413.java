package com.codegym.Level4.Lesson4;
/* Use the keyboard to enter a number representing a day of the week. Then, depending on the
entered number, display the name of the day of the week: "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", if you enter a number greater than 7 or less than 1, display "No such day of the week".

Example for number 5:
Friday

Example for number 10:
No such day of the week

Requirements:
The program should read a number from the keyboard.
The program should display text on the screen.
If you enter a number from 1 to 7, you need to display the name of the day of the week.
If you enter a number outside the range of 1 to 7, then display a notification that there is no such
 day of the week.
 */

import javax.swing.*;

public class Task04_0413 {
    public static void main(String[] args)  {
        //write your code here

        int day = Integer.parseInt(JOptionPane.showInputDialog("Introduce dia de la semana"));

            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("No such day of the week");
                    break;
            }
        }

    }
