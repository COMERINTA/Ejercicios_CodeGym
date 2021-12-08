package com.codegym.Level2.Lesson2;
/* In the Person class, declare the following variables: String name, int age, int weight, int money.
In the main method, create a Person object and store a reference to it in the variable person.

Hint: Use the following construct to create a Person object and assign a reference to that object to the
variable person:
VariableType variableName = new TypeOfObjectBeingCreated();

Requirements:
•	In the Person class, declare a String variable called name.
•	In the Person class, declare an int variable called age.
•	In the Person class, declare an int variable called weight.
•	In the Person class, declare an int variable called money.
•	In the main method, create a Person object and immediately assign a reference to it to the variable person.
•	Five variables must be declared.
 */

public class Task02_0202 {
    public static <VariableType> void main(String[] args) {
        //write your code here
        Person person = new Person();
    }

    public static class Person {
        //write your code here
        String name;
        int age;
        int weight;
        int money;

    }
}
