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
        char a = 'a';
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
        char b = 'b';
        {
            int temp = outervariable;
            double temp2 = pi;
            printInt();
            printStatic();
        }
    }
    private class InnerClassC{
        char c = 'c';
        {
            int temp = outervariable;
            double temp2 = pi;
            printInt();
            printStatic();
        }

    }
    {
        InnerClassA.printChar();//Не работает
    }
}
public class Main {
    public static void main(String[] args){
        OuterClass outer = new OuterClass();
        OuterClass.InnerClassA innera = outer.new InnerClassA();//Доступно отовсюду
        OuterClass.InnerClassB innerb = outer.new InnerClassB();//Доступно только из того-же пакета или из потомков класса
        OuterClass.InnerClassC innerc = outer.new InnerClassC();//Нет Доступа из вне класса
    }
}
