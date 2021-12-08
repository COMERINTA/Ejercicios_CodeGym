package com.codegym.Level3.Lesson3;
/*Write code for the convertEurToUsd method, which converts euros to dollars at a given exchange rate.
Use a return statement to return the result from the convertEurToUsd method. Example: return 123*435;
Call the convertEurToUsd method twice in the main method with any arguments.
Display the results, each time on a new line.

Hint:
The result is calculated using the following formula: US dollars = euros * exchange rate

Requirements:
•	The convertEurToUsd method must multiply the euro amount by the exchange rate and return the result.
•	The main method must call the convertEurToUsd method twice with any arguments.
•	The main method should display the result of the calls, each time on a new line.
•	The convertEurToUsd method should not display anything.
 */

public class Task03_0303 {
    public static void main(String[] args) {
        //write your code here
        double v = convertEurToUsd(100, 0.8);
        double v1 = convertEurToUsd(200, 0.8);
        System.out.println(v);
        System.out.println(v1);
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        return eur * exchangeRate;
    }
}

