package com.company.innerclasses;
class OuterClass{
    public int outervariable = 1;
    private static final double pi = 3.1415926;
    public void printInt(){
        System.out.println(outervariable);
    }
    private static void printStatic(){
        System.out.println("Static");
    }
    public class InnerClassA{
        public char a = 'a';
        {
            int temp = outervariable;
            double temp2 = pi;
            printInt();
            printStatic();
        }
        public void printChar(){
            System.out.println(a);
        }
    }
    protected class InnerClassB{
        private char b = 'b';
        {
            int temp = outervariable;
            double temp2 = pi;
            printInt();
            printStatic();
        }
        public void printChar(){
            System.out.println(b);
        }
    }
    private class InnerClassC{
        private char c = 'c';
        {
            int temp = outervariable;
            double temp2 = pi;
            printInt();
            printStatic();
        }
        public void printChar(){
            System.out.println(c);
        }
    }
    {
        InnerClassC c = new InnerClassC();
        InnerClassB b = new InnerClassB();
        char c1 = c.c;//Даже приватные переменные и методы внутренних классов можно использовать во внешнем классе
        char b1 = b.b;
        c.printChar();
    }
}
public class Main {
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClassA innera = outer.new InnerClassA();//Доступно отовсюду
        OuterClass.InnerClassB innerb = outer.new InnerClassB();//Доступно только из того-же пакета или из потомков класса
        char b1 = innerb.b;
        innerb.printChar();//Работает т.к. метод - public
        OuterClass.InnerClassC innerc = outer.new InnerClassC();//Нет Доступа из вне класса
    }
}
