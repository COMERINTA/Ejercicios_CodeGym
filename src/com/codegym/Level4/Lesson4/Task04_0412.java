package com.codegym.Level4.Lesson4;

import java.util.Scanner;

public class Task04_0412 {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
        {
            a = a*2;
        }
        else if (a < 0)
        {
            a = a+1;
        }
        else
        {
            a = 0;
        }
        System.out.println(a);
    }
}
