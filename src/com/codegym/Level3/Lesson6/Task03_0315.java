package com.codegym.Level3.Lesson6;
/* Create 7 objects to display the 7 colors of the rainbow on the screen.
Example output:
Red
Orange
Yellow
Green
Blue
Indigo
Violet
Each object displays a specific color when it is created.

Requirements:
•	The program should output text.
•	You need to create 7 different objects responsible for the colors.
•	The order in which the objects are created must correspond to the order of the colors in the rainbow.
•	Don't change the classes responsible for the colors.
•	The displayed text must match the task conditions.
 */

public class Task03_0315 {
    public static void main(String[] args) {
        new Red();
        new Orange();
        new Yellow();
        new Green();
        new Blue();
        new Indigo();
        new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
