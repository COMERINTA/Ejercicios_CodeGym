package com.codegym.Level3.Lesson5;
/* Implement the public static void writeToConsole(String s) method, which adds "printing: " to the beginning of the string and displays the altered string.

Example output for "Hello, World! ":
printing: Hello, World!

Requirements:
•	Add a writeToConsole method that takes a String argument.
•	The writeToConsole method must be void.
•	The writeToConsole method must be static.
•	The writeToConsole method must be public.
•	The writeToConsole method should add "printing: " to the beginning of the string and display the result.
•	The program should display "printing: Hello, World!".
 */

public class Task03_0311 {
    public static void main(String[] args) {
        writeToConsole("Hello, World!");
    }

    public static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}
