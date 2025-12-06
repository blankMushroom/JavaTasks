package com.company.cycles;

public class Main {
    public static void main(String[] args){
        int a = 0;
        while(true){
            System.out.println(a);
            a += 2;
            if(a >= 10){
                break;
            }
            if(a != 6){
                continue;
            }
            a -= 5;
        }
        do{
            a--;
            if(a < 0){
                break;
            }
        }while(true);
    }
}
