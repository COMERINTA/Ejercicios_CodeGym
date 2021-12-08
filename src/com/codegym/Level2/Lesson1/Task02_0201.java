package com.codegym.Level2.Lesson1;
/* In the print method, display the passed string 4 times. Each time, on a new line.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The print method should display the text on the screen.
•	The main method should call the Solution class's print method exactly three times.

 */
public class Task02_0201 {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
