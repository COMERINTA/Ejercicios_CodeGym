package com.codegym.Level4.Lesson16;

import javax.swing.*;

public class Task04_0442Bis {
    public static void main(String[] args) {

        int sum = 0;
        while (true) {
            String numero = JOptionPane.showInputDialog("Introduce un número: ");
            int a = Integer.parseInt(numero);
            sum += a;

            if (a == -1){
                System.out.println(sum);
                return;
            }
        }
    }
}
