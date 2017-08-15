package com.example.helloworld;

import java.util.Random;
import java.util.*;

/**
 * Created by nyatsulk on 8/15/17.
 */
class thread1 implements Runnable {

    int     time;
    String name;
    Random r = new Random();

    public thread1(String name){
        this.name = name;
        time = r.nextInt(700);
    }

    public void run(){
        System.out.printf("Thread %s slepp %d\n", name, time);
        try{
            Thread.sleep(time);
        }catch (Exception e){}
        System.out.printf("Thread %s is woke up\n", name);
    }
}
