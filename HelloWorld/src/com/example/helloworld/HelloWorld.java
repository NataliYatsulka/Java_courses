package com.example.helloworld;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;

/**
 * Created by nyatsulk on 8/9/17.
 */
public class HelloWorld {
    static String[][] mas = new String[5][3];
    static Scanner scn;

    public static void main(String[] args) {
        openFile();
        readFile();
        out();
    }

    private static void out() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void readFile() {
        while (scn.hasNext()) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = scn.next();
                }
            }
        }
    }

    private static void openFile(){
        try {
            scn = new Scanner(new File("res//1.txt"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found");
        }
    }
}