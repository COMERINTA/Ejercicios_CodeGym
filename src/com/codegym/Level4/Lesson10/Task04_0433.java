package com.codegym.Level4.Lesson10;
/* Use a while loop to display a 10x10 square of dollar signs.
Don't separate the symbols in each line.

Example output:
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$

Requirements:
The program should not read text from the keyboard.
The program should display text on the screen.
The program should display a 10x10 square of dollar signs.
The program must use a while loop.
 */

public class Task04_0433 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name = "$$$$$$$$$$";
        int a = 10;

        while (a>0){
            System.out.println(name);
            a--;
        }
    }
}
