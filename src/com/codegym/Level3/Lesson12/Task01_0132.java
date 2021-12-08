package com.codegym.Level3.Lesson12;
/* Write the code for sumDigitsInNumber(int number). The method takes a three-digit whole number. You need to calculate the sum of the digits of this number, and then return the result.

Consider this example:
The sumDigitsInNumber method is called with the argument 546.

Example output:
15

Requirements:
•	The program must not read data from the keyboard.
•	The sumDigitsInNumber(int) method must be public and static.
•	The sumDigitsInNumber method must return an int.
•	The sumDigitsInNumber method should not display anything.
•	The sumDigitsInNumber method must return the sum of all digits in the parameter number.
 */

public class Task01_0132 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int sum = 0;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        return sum;
    }
}

