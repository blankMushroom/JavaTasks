package com.company.nestedclasses;

interface I{
    class A{//Вложенный класс обязан быть статическим, но т.к. он находится в интерфейсе ключевое слово static можно пропустить
        private int a;
        public void setA(int a){
            this.a = a;
        }
        public int getA(){
            return a;
        }
    }
}

public class Main {
    public static void main(String[] args){
        I.A a = new I.A();//Т.к. класс статический, его объект создается от всего интерфейса.
        a.setA(5);
        System.out.println(a.getA());//Далее его методы вызываются как обычно
    }
}
