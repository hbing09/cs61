package com.huizi;

//CS61B

public class Main {
    /* return the larger of x and y */
    public static int larger(int x, int y){
        if (x > y){
            return x;
        }
        return y;
    }


    public static void main(String[] args) {
        // write your code here
        System.out.println(larger(-5, 10));

    }
}