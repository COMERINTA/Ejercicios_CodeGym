package com.codegym.Level2.Lesson3;
/* Create 3 Dog objects.
Store each instance in a separate variable.
Give them the names "Max", "Bella", and "Jack".

Requirements:
•	The program should not display text on the screen.
•	The main method should have only three Dog variables.
•	The variables must be immediately assigned values.
•	Each Dog object must be assigned a name.
•	The Dog class must have a single variable called name.
•	The Dog class should not have methods.

 */

public class Task02_0209 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";

        //write your code here
    }

    public static class Dog {
        public String name;
    }
}
