package com.codegym.Level1.Lesson8;
/* Escribe un programa que muestre en la pantalla el cuadrado de 5.

Requirements:
•	El programa debe generar texto.
•	El método main debe llamar al método cuadrado con 5 como argumento.
•	El método main debe mostrar el resultado del método cuadrado.
•	No cambies el método cuadrado.
•	El texto mostrado debe cumplir las condiciones de la tarea.
 */

public class Task01_0127 {
    public static void main(String[] args) {
        //escribe aquí tu código
        int a = 5;
        int c = cuadrado(a);
        System.out.println(c);
    }

    public static int cuadrado(int a) {
        return a * a;
    }
}
