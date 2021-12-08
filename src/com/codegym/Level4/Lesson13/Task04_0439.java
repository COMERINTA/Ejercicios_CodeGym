package com.codegym.Level4.Lesson13;
/* Enter a name from the keyboard and use a for loop to display the following 10 times: <name> loves me.

Example output for the name "Scarlett":
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.

Requirements:
The program should read the name from the keyboard.
The program should display text on the screen.
The program should display the text specified in the task 10 times.
The program must use a for loop.
 */

public class Task04_0439 {
    public static void main(String[] args) {

        String name = "Scarlett";

        for (int a=0; a<10; a++)
            System.out.println(name + " loves me.");

    }
}
