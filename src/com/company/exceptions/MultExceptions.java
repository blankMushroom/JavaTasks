package com.company.exceptions;

public class MultExceptions {
    public static void main (String[] args){
        try{
            System.out.println(1/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        int[]a = {1,2,3};
        System.out.println(a[3]);
    }
}
