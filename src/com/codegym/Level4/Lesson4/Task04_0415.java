package com.codegym.Level4.Lesson4;
/* Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
Determine whether a triangle with these sides can exist.
Display the result as follows:
"The triangle is possible." - if a triangle with these sides could exist.
"The triangle is not possible." - if a triangle with these sides cannot exist.

Hint:
A triangle can exist only if the sum of two of its sides is greater than the third side.
You need to compare each side with the sum of the other two.
If even one side is larger or equal to the sum of the other two sides, then no such triangle exists.

Requirements:
The program should read three numbers from the keyboard.
The program should display text on the screen according to the task conditions.
If a triangle with the specified sides could exist, you need to display: "The triangle is possible."

 */
import javax.swing.*;
import java.io.*;
import java.util.Scanner;


public class Task04_0415 {
    public static void main(String[] args){
        //write your code here
        Scanner mideLado = new Scanner(System.in);
        int a = mideLado.nextInt();
        int b = mideLado.nextInt();
        int c = mideLado.nextInt();

        int z = a+b;
        int y = a+c;
        int x = b+c;

        if ((z > c) && (y > b) && (x > a)){
            System.out.println("The triangle is possible");
        }else {
            System.out.println("The triangle is not possible");
        }

    }
}
