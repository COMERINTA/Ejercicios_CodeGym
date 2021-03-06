package com.codegym.Level2.Lesson8;
/* "Amigo, did you know that lunar gravity is about 17% of gravity on Earth?"
"Nope."
"Neither did I. Now this information will be used a lot. To avoid having to manually calculate it each time,
implement a getWeight(int) method that takes a person's body weight on Earth (in newtons), and returns the weight
 of that person on the moon (in newtons).
The method should return a double."

Consider this example:
The getWeight method is called with the argument 888.

Example output:     150.96

Requirements:
•	The getWeight(int) method must be public and static.
•	The getWeight method must return a double.
•	The getWeight method should not display anything.
•	The getWeight method should correctly convert the Earth weight in newtons to the lunar weight, and then
return this value.
 */

public class Task01_0136 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        // write your code here
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}
