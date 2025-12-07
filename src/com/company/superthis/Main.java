package com.company.superthis;
class A{
    protected int a;
    public A(int a){
        this.a = a;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
}
class B extends A {
    private int b;
    public B(int a){
        super(a);
    }
    @Override
    public void setA(int a){
        super.setA(a);
        b = a;
    }
    public void setB(int a){
        b = a;
        super.a = a;
    }
}
public class Main {
}
