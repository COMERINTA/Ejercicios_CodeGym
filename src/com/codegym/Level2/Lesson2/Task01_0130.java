package com.codegym.Level2.Lesson2;
/* The convertCelsiusToFahrenheit(int celsius) method accepts a value in degrees Celsius. The method
should convert the temperature and return the value in degrees Fahrenheit.
The Celsius temperature (TC) and the Fahrenheit temperature (TF) are related by the following relationship:
TF = (9 / 5) * TC + 32.

Consider this example:
A value of 41 is passed to the convertCelsiusToFahrenheit method.

Example output:
105.8

Requirements:
•	The convertCelsiusToFahrenheit(int) method must be public and static.
•	The convertCelsiusToFahrenheit method must return a double.
•	The convertCelsiusToFahrenheit method should not display anything.
•	The convertCelsiusToFahrenheit method must correctly convert degrees Celsius to degrees Fahrenheit and
return the result.
 */

public class Task01_0130 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {
        //write your code here
        double TF = 9/5. * celsius + 32;
        return TF;
    }
}
