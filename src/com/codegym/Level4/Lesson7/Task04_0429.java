package com.codegym.Level4.Lesson7;

import javax.swing.*;

public class Task04_0429 {
    public static void main(String[] args) throws Exception {
        //write your code here
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        int cont = 0;
        int cont2 = 0;

        if ( a > 0){
            cont++;
        }if ( a<0){
            cont2++;
        }if ( b > 0){
            cont++;
        }if ( b<0){
            cont2++;
        }if ( c > 0){
            cont++;
        } if ( c<0){
            cont2++;

        }   System.out.println("Number of negative numbers: " + cont2);
        System.out.println("Number of positive numbers: " + cont);

    }}
