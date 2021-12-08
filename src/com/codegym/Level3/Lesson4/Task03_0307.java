package com.codegym.Level3.Lesson4;
/* Create 5 Zerg units, 3 Protoss units and 4 Terran units.
Give them all unique names.

Requirements:
•	Don't change the Zerg, Protoss, and Terran classes.
•	Create 5 Zerg objects and name each of them.
•	Create 3 Protoss objects and name each of them.
•	Create 4 Terran objects and name each of them.
 */

public class Task03_0307 {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "z1";
        zerg2.name = "z2";
        zerg3.name = "z3";
        zerg4.name = "z4";
        zerg5.name = "z5";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.name = "p1";
        protoss2.name = "p2";
        protoss3.name = "p3";

        Terran terran01 = new Terran();
        Terran terran02 = new Terran();
        Terran terran03 = new Terran();
        Terran terran04 = new Terran();

        terran01.name = "t1";
        terran02.name = "t2";
        terran03.name = "t3";
        terran04.name = "t4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
