package com.codegym.Level4.Lesson1;
/* Calculate the total cost of apples.
The total cost of apples corresponds to public static int applePrice.

Requirements:
•	The program should display text on the screen.
•	The Apple class's addPrice method should not display text on the screen.
•	The Apple class's applePrice variable must be a static int initialized to zero.
•	The main method should call the addPrice method only twice.
•	The Apple class's addPrice method should increase the cost of apples by the passed-in value.
 */

public class Task04_0402 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            //write your code here
            Apple.applePrice = Apple.applePrice + applePrice;
        }
    }
}
