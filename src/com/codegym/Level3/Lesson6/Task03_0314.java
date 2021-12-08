package com.codegym.Level3.Lesson6;
/* Display a 10 x 10 multiplication table in the following form:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…

Requirements:
•	The program should output text.
•	The displayed text should contain 10 lines.
•	Each displayed string must contain 10 numbers separated by spaces.
•	The displayed numbers must form a multiplication table.
 */

public class Task03_0314 {
    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
