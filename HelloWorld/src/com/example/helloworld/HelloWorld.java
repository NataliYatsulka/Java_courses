package com.example.helloworld;

import javax.swing.*;

/**
 * Created by nyatsulk on 8/9/17.
 */
public class HelloWorld {

    public static void main(String[] args) {
        Reader r = new Reader("Calculator");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(250, 250);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }


}