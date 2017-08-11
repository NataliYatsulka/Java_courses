package com.example.helloworld;

/**
 * Created by nyatsulk on 8/9/17.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Reader r = new Reader();
        r.Scan();
        r.i = count(r.i);
        r.k = count(r.k);
        r.Scan(r.i, r.k);

//        i  = count(i);
//        k = count(k);
//        System.out.println("i = " + i);
//        System.out.println("k = " + k);

    }

        private static int count(int i){
            i = i + 10;
            return i;
        }

}