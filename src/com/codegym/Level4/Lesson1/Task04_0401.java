package com.codegym.Level4.Lesson1;
/* Think about what the program is doing.
Fix the programming error so that person.age changes value.

Hint:
carefully review the adjustAge method.

Requirements:
•	The program should display text on the screen.
•	The Person class should have a public int field called age.
•	The Person class's adjustAge method should display text on the screen.
•	The Person class's adjustAge method must have only one int parameter named age, and the method must be void.
•	The main method should call the adjustAge method only once.
•	The Person class's adjustAge method should increase the Person's age by 20.
 */

public class Task04_0401 {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = age + 20;
            System.out.println("The age in adjustAge() is " + age);
        }
    }
}
