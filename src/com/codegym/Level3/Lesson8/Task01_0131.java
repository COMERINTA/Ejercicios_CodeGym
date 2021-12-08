package com.codegym.Level3.Lesson8;
/* Implement the getFeetFromInches(int inches) method. The method takes the number of inches.
Your task is to make the method return the number of full feet represented by the variable inches.
(1 feet = 12 in).

Consider this example:
The getFeetFromInches method is called with the argument 243.

Example output:
20

Requirements:
•	The getFeetFromInches(int) method must be public and static.
•	The getFeetFromInches method must return an int.
•	The getFeetFromInches method should not display anything.
•	The getFeetFromInches method must correctly return the number of full feet represented by the variable
 inches.
 */

public class Task01_0131 {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(28));
    }

    public static int getFeetFromInches(int inches) {
        //write your code here
        int feet = inches / 12;
        return  feet;
    }
}
