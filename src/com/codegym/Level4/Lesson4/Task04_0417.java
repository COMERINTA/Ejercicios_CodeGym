package com.codegym.Level4.Lesson4;
/* Use the keyboard to enter three integers. Determine whether there is at least one pair of equal numbers among them.
If such a pair exists, display the numbers separated by a space.
If all three numbers are equal, then display all three.
Here are some examples:
a) if you enter the numbers
1
2
2
then we display
2 2

b) if you enter the numbers
2
2
2
then we display
2 2 2

Requirements:
The program should read the numbers from the keyboard.
The program should contain System.out.println() or System.out.print().
If two numbers are equal to each other, you must display them on the screen.
If all three numbers are equal, then display all three.
If there are no equal numbers, don't display anything.
 */

import java.io.BufferedReader;
import java.util.Scanner;

public class Task04_0417 {
    public static void main(String[] args){
        //write your code here
        //BufferedReader reader = new BufferedReader (InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && b==c){
            System.out.println(a + " " + b + " " + c);
        }else{
            if (a==b){
                System.out.println(a + " " + b);
            }
            if (a==c){
                System.out.println(a + " " + c);
            }
            if (b==c){
                System.out.println(b + " " + c);
            }
        }
    }
}

