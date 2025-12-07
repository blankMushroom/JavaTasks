package com.company.annotation;
class A{
    int a = 2;
    @Deprecated
    public void oldStinkyMethod(){
        System.out.println(a);
    }
    public void newShinyMethod(){
        System.out.println("cooler " + a);
    }
}
class B extends A{
    int b = 3;
    @Override
    public void newShinyMethod(){
        System.out.println("cooler " + a + " and " + b);
    }
}
public class Main {
    @SuppressWarnings("deprecation")
    public static void runMethods(B b){
        b.newShinyMethod();
        b.oldStinkyMethod();
    }
    public static void main(String[] args){
        B b = new B();
        runMethods(b);
    }
}
