package com.codegym.Level4.Lesson2;
/* Finish writing the code of the setName method so that it sets the value of private String fullName to the
 value of the local String variable fullName.

Requirements:
•	The Cat class must contain only one fullName variable.
•	The variable fullName must be a String and have a private access modifier.
•	The Cat class must have only two methods: setName and main.
•	The setName method must have a local variable fullName.
•	The Cat class's setName method must set the value of the global private String variable fullName equal to the
 local variable fullName.
 */

public class Task04_0406 {
    public class Cat {
        private String fullName;

        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            this.fullName = fullName;


            //write your code here
        }

        public static void main(String[] args) {

        }
    }
}
