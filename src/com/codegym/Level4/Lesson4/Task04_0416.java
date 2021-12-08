package com.codegym.Level4.Lesson4;
/* The pedestrian traffic light is programmed as follows:
at the beginning of each hour, the green signal is on for three minutes,
then the signal is yellow for one minute,
and then it is red for one minute.
Then the light is green again for three minutes, etc.
Use the keyboard to enter a real number t that represents the number of minutes that have elapsed since the beginning of the hour.
Determine what color the traffic light is at the specified time.
Display the result as follows:
"green" if the light is green,
"yellow" if the light is yellow, and
"red" if the light is red.

Example for 2.5:
green
Example for 3:
yellow
Example for 4:
red
Example for 5:
green

Requirements:
The program should read a real number from the keyboard.
The program should display text on the screen.
If the light is green, display: "green"
If the light is yellow, display: "yellow"
If the light is red, display: "red"
 */

import java.util.Scanner;

public class Task04_0416 {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner (System.in);
        double t = sc.nextDouble();
        t = t % 5;
        if (t >= 0 && t < 3) {
            System.out.println("green");
        } else if (t >= 3 && t < 4) {
            System.out.println("yellow");
        } else if (t >= 4 && t < 5) {
            System.out.println("red");
        }
    }
}
