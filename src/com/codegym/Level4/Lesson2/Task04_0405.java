package com.codegym.Level4.Lesson2;
/* Write the setCatCount method. The method must set the number of cats (catCount).

Requirements:
The Cat class must have only one catCount variable.
The variable catCount must be a static int, have a private access modifier, and be initialized to zero.
The Cat class must have two methods: setCatCount and main.
The Cat class's setCatCount method must set the value of the catCount variable equal to the passed argument.

 */

public class Task04_0405 {

    public class Cat {
        private static int catCount = 0;

        public static void setCatCount(int catCount) {
            //write your code here
            Cat.catCount = catCount;
        }

        public static void main(String[] args) {

        }
    }
}

