package com.codegym.Level3.Lesson3;
/* Write the code for the addTenPercent method, which increases the passed integer by 10%.
Use the return statement to return the result from the addTenPercent method.

Consider this example:
return 123 * 435;

Requirements:
•	The addTenPercent method should increase the passed number by 10% percent.
•	The main method should call the addTenPercent method.
•	The main method should display the results of the call.
•	The addTenPercent method should not display anything.
 */

public class Task03_0304 {
    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }

    public static double addTenPercent(int i) {
        //write your code here

        return i * 1.1;
    }


}
