package com.codegym.Level4.Lesson7;

import javax.swing.*;

public class Task04_0426 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));

        if (a == 0) {
            System.out.println("Zero");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("Positive even number");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("Positive odd number");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("Negative even number");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("Negative odd number");
        }
    }
}
