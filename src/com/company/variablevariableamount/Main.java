package com.company.variablevariableamount;

public class Main {
    public static void printNumbers(int... numbers){
        for(int n : numbers){
            System.out.println(n);
        }
    }
    public static void printNumbers(char param, int... numbers){//Метод printnumbers перегружен чтобы принимать параметр системы счисления.
        switch(param){
            case 'd':
                for(int n : numbers){
                    System.out.println(n);
                }
                break;
            case 'b':
                for(int n : numbers){
                    System.out.println(Integer.toString(n, 2));
                }
                break;
            case 'h':
                for(int n : numbers){
                    System.out.println(Integer.toString(n, 16));
                }
                break;
            default:
                System.out.println("Invalid Parameter");
        }
    }
    public static void main(String[] args){
        printNumbers(10,11,12);
        printNumbers('h',10,11,12);
    }
}
