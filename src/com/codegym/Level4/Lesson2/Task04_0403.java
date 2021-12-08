package com.codegym.Level4.Lesson2;
/* Help the cat get a name using the setName method.

Requirements:
•	The Cat class must contain only one variable called name.
•	The variable name must be a String and have a private access modifier.
•	The Cat class must have only two methods: setName and main.
•	The Cat class's setName method must set the value of the private String variable name equal to
the passed String argument name.
 */

public class Task04_0403 {
    public static class Cat {
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Simba");
            System.out.println(cat.name);
        }
        private String name = "nameless cat";

        public void setName(String name) {
            //write your code here
            this.name = name;
        }
    }
}
