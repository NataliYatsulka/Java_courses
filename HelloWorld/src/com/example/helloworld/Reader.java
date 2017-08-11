package com.example.helloworld;

import java.util.Scanner;

/**
 * Created by nyatsulk on 8/11/17.
 */
public class Reader {
    int i;
    int k;

    public void Scan(){
        System.out.println("input first number");
        Scanner scn = new Scanner(System.in);
        i = scn.nextInt();
        System.out.println("input scond number");
        k = scn.nextInt();

    }
}
