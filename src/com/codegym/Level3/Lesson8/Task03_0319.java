package com.codegym.Level3.Lesson8;

import javax.swing.*;

public class Task03_0319 {
    public static void main(String[] args) throws Exception {
        //write your code here
        String name = JOptionPane.showInputDialog("Introduce el nombre");
        String number1 = JOptionPane.showInputDialog("Introduce la cantidad");
        String number2 = JOptionPane.showInputDialog("Introduce años");

        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
