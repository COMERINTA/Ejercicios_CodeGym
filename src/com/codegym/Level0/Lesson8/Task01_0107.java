package com.codegym.Level0.Lesson8;

/* Quita el comentario de una línea para que el programa muestre los números 12 y 2 (primero 12 y luego 2).

Requirements:
•	El programa debe mostrar los números 12 y 2.
•	No cambies las líneas que declaran variables.
•	El programa debe tener solo dos variables int.
•	No cambies las líneas responsables de la salida por pantalla.
•	Debes quitar el comentario de una línea y dejar sin modificar las demás.

 */

public class Task01_0107 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
