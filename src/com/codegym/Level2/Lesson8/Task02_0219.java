package com.codegym.Level2.Lesson8;
/*
Implement the print3 method. The method should display the passed string (word) three times, but on the same line.
Words must be separated by a space and should not merge into one.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The print3 method should display the text on the screen.
•	The main method should call the print3 method only twice.
•	The print3 method should display the passed string (word) three times, but on the same line.
 */

public class Task02_0219 {
    public static void print3(String s) {
        //write your code here
        System.out.print(s + " ");
        System.out.print(s + " ");
        System.out.println(s);
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
