package com.codegym.Level4.Lesson2;
/* Write code in the addNewCat method to increase the number of cats by 1 each time it is called.
The variable catCount corresponds to the number of cats.

Requirements:
•	The Cat class must have only one catCount variable.
•	The variable catCount must be a static int, have a private access modifier, and be initialized to zero.
•	The Cat class must have two methods: addNewCat and main.
•	The Cat class's addNewCat method should increase the number of cats by 1.
 */

public class Task04_0404 {
    public class Cat {
        private static int catCount = 0;

        public static void addNewCat() {
            //write your code here
            catCount++;
        }

        public static void main(String[] args) {

        }
    }
}
