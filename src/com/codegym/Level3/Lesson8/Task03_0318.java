package com.codegym.Level3.Lesson8;

import javax.swing.*;
import java.io.*;

public class Task03_0318 {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String years = reader.readLine();
        String name = reader.readLine();

        System.out.println(name + " will take over the world in " + years + " years. Mwa-ha-ha!");
    }
}
