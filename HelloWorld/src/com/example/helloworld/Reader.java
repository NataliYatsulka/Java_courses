package com.example.helloworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame{
    JButton b1, b2;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    String a, b;


    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Delete");
        b2 = new JButton("Calculate");
        l1 = new JLabel("Put first numb");
        l2 = new JLabel("Put second numb");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        add(b1);
        add(b2);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);

    }

}
