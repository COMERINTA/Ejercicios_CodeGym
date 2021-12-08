package com.codegym.Level3.Lesson5;
/* Amigo, today our task is to fill the ship's pool. Calculate how many liters of water are
needed to fill the pool all the way up. The pool is known to have linear dimensions a x b x c, given in meters.
These dimensions are passed to the getVolume method. The method should return the number of liters of water
 needed to fill the pool.

Consider this example:
The getVolume method is called with the arguments 25, 5, and 2.

Example output:
250000

Requirements:
•	The getVolume(int, int, int) method must be public and static.
•	The getVolume(int, int, int) method must return a long.
•	The getVolume(int, int, int) method should not display anything.
•	The getVolume(int, int, int) method must return the correct amount of water, in liters, that is needed
to fill the pool.
 */

public class Task01_0134 {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //write your code here
        return 1000L * a * b * c;
    }
}
