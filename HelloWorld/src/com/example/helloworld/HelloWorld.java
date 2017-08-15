package com.example.helloworld;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        Thread t1 = new Thread(new thread1("tatatata"));
        Thread t2 = new Thread(new thread1("lalala"));
        Thread t3 = new Thread(new thread1("fafa"));
        t1.start();
        t2.start();
        t3.start();
    }
}