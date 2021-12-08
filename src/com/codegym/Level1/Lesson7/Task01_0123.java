package com.codegym.Level1.Lesson7;
/* Comenta las variables que no se usen. El programa debe compilar.

Requirements:
•	No cambies los tipos de las variables.
•	No cambies los valores de las variables.
•	No añadas nuevas líneas al programa ni elimines las existentes.
•	Tienes que comentar las variables que no se utilicen.
•	No debes cambiar la salida del programa.

 */

public class Task01_0123 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
//        int d = a + 12;
//        double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
//        String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}
