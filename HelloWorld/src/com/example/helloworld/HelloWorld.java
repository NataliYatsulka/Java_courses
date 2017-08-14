package com.example.helloworld;

import javax.swing.*;

/**
 * Created by nyatsulk on 8/9/17.
 */
public class HelloWorld {

    public static void main(String[] args) {

//        int[][] mas = new int[3][3];
        int[][] mas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + " ");
                try{
                    Thread.sleep(1000);
                }catch (Exception e){}
            }
            System.out.println();
            }
    }
}