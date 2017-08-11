package com.example.helloworld;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Reader {
    int i, k;
    String n1, n2;

    public void Scan(){

        n1 = JOptionPane.showInputDialog("input first numb");
        n2 = JOptionPane.showInputDialog("input second numb");
        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);

    }

    public void Scan(int a, int b){

        JOptionPane.showMessageDialog(null, "Now i = " + a);
        JOptionPane.showMessageDialog(null, "Now k = " + b);

    }
}
