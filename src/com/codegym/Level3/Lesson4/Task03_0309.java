package com.codegym.Level3.Lesson4;
/* Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
1
1+2=3
1+2+3=6
...

Example output:
1
3
6
...

Requirements:
•	The program should output text.
•	The displayed text should contain 5 lines.
•	The number in each new line must be greater than the previous one.
•	The displayed text must match the task conditions.
 */

public class Task03_0309 {
    public static void main(String[] args) {
        //write your code here
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        System.out.println(a);
        System.out.println(a+b);
        System.out.println(a+b+c);
        System.out.println(a+b+c+d);
        System.out.println(a+b+c+d+e);
    }
}

