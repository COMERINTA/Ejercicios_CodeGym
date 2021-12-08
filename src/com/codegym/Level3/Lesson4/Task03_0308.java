package com.codegym.Level3.Lesson4;
/* Display the product of the 10 numbers from 1 to 10.
The result is a single number.

Hint:
it will be three million and change.

Requirements:
•	The program must display an integer.
•	The main method should call the System.out.println method.
•	The displayed number should be more than three million.
•	The displayed number must match the task conditions.
 */

public class Task03_0308 {
    public static void main(String[] args) {
        //write your code here
        int p = 1;
        for (int i = 2; i <=10; i++){
            p *= i;
        }
        System.out.println(p);
    }
}
