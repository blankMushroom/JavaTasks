package com.company.interfaces;
interface I1{
    default void display(){
        System.out.println("Interface 1");
    }
    static void stat(){
        System.out.println("Static");
    }
}
interface I2{
    default void display(){
        System.out.println("Interface 2");
    }
}
class A implements I1, I2{//Ошибка множественного наследования метода display
    @Override
    public void display(){//Выходим из конфликта переопределением метода в наследующем классе
        I1.super.display();
        I2.super.display();
    }
}
public class Main {
    public static void main(String[] args){
        A a = new A();
        a.display();
        I1.stat();
    }
}
