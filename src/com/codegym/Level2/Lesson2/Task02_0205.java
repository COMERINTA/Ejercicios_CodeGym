package com.codegym.Level2.Lesson2;
/* In the public static void hackSalary(int a) method, increase the salary by 1000 and display the
following: "Your salary is: <a+1000> dollars per month."
where <a+1000> is the salary increased by 1000.

Example output for a = 7000:
Your salary is: 8000 dollars per month.

Requirements:
•	The program should display text on the screen.
•	The main method should not call System.out.println or System.out.print.
•	The hackSalary method should not return a result.
•	The main method should call the hackSalary method only once.
•	The hackSalary method should increase the input parameter by 1000 and output text to the screen according
to the specified template.
 */

public class Task02_0205 {

    public static void main(String[] args) {
        hackSalary(7000);
    }
    public static void hackSalary(int a) {
        //write your code here
        int z = a + 1000;
        System.out.println("Your salary is: "+ z + " dollars per month.");
    }
}
