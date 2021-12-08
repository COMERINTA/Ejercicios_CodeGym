package com.codegym.Level1.Lesson4;
/* En el método main, pon correctamente los signos más y menos para que la variable resultado dé 20.
Solo debes colocar los signos en la línea donde se declara la variable resultado.
No cambies el orden de las variables en esta línea.
Cada variable debe ir precedida por un signo más o menos.

Requirements:
•	Valores de las variables: no cambies a, b, c ni d.
•	Cada una de las variables (a, b, c y d) de la línea donde se declara la variable resultado debe ir precedida por un signo más o menos.
•	El programa debe mostrar en la pantalla el número 20.
•	Los signos más y menos deben colocarse correctamente.


 */

public class Task01_0137 {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {

        int resultado = - a + b - c + d;

        System.out.println(resultado);
    }
}
