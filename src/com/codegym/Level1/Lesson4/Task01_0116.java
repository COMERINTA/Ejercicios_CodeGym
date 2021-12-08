package com.codegym.Level1.Lesson4;

/* Cambia el programa para que la variable nombre adopte el valor «Amigo».

Requirements:
•	A la variable nombre se le debe asignar un valor inmediatamente después de su declaración.
•	Se deben declarar dos variables.
•	El valor de la variable texto no se puede cambiar.
•	No puedes cambiar el comando de salida por pantalla.
•	El programa debe mostrar «¡Hola, Amigo!».

 */

public class Task01_0116 {
    public static void main(String[] args) {
        String nombre = "Amigo";
        String texto = "¡Hola, " + nombre + "!";
        System.out.println(texto);
    }
}
