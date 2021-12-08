package com.codegym.Level1.Lesson8;
/* Escribe un programa que llame al método sumar con los argumentos 2 y 2.

Requirements:
•	El programa debe mostrar la suma de 2 más 2.
•	El método main debe llamar al método sumar con los argumentos 2 y 2.
•	El método main no debe llamar a un método de salida por pantalla.
•	No cambies el método sumar.

 */
public class Task01_0128 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        sumar(a,b);
    }
    public static void sumar(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}
