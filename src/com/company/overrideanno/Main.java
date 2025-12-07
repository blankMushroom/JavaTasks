package com.company.overrideanno;
class A{
    public void method(){
        System.out.println("blep");
    }
}
class B extends A{
    @Override//Ошибка, метода mehtod в классе A - нет
    public void mehtod(){
        System.out.println("bloop");
    }
}
public class Main {
}
