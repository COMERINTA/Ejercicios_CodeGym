package com.codegym.Level4.Lesson16;
/* Use the keyboard to enter numbers.
If the user enters -1, display the sum of all entered numbers and end the program.
-1 should be included in the sum.

Hint: one of the solutions to this problem uses the following construct:

while (true) {
    int number = read the number;
    if (check whether the number is -1)
        break;
}
Requirements:
The program should read the numbers from the keyboard.
If the user enters -1, the program should display the sum of all entered numbers and then end.
The program must calculate and display the sum of the entered numbers.
The program must use a for loop or a while loop.
 */

public class Task04_0442 {
    public static void main(String[] args) {

        int num1 = 14;
        int num2 = 11;
        int num3 = 19;
        int num4 = 9;
        int num5 = -1;


        while  (num1 != -1 && num2 != -1 && num3 != -1 && num4 != -1 && num5 == -1) {
            int suma = num1 + num2 + num3 + num4 + num5;
            System.out.println(suma);
            break;
        }
        while (num1 != -1 && num2 != -1 && num3 != -1 && num4 == -1) {
            int suma1 = num1 + num2 + num3 + num4;
            System.out.println(suma1);
            break;
        }
        while (num1 != -1 && num2 != -1 && num3 == -1) {
            int suma2 = num1 + num2 + num3;
            System.out.println(suma2);
            break;
        }
        while (num1 != -1 && num2 == -1) {
            int suma3 = num1 + num2;
            System.out.println(suma3);
            break;
        }
        while(num1 <= 0 && num1 >= 0){
               System.out.println(num1);
                            }
                        }
                    }

