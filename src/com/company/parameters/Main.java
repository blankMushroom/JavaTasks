package com.company.parameters;

import java.util.*;

class A<T> {
    private T item;
    private LinkedList<? extends T> list1;//Конструкция <? extends T> используется, чтобы ограничить возможные значения параметр. типа до значений наследующих тип T
    private LinkedList<? super T>list2;//Конструкция <? extends T> используется, чтобы ограничить возможные значения параметр. типа до значений наследуемых от типа T
    public void setItem(T newitem){
        this.item = newitem;
    }
    public T getItem(){
        return this.item;
    }

    public void setList1(LinkedList<? extends T> list1) {
        this.list1 = list1;
    }
    public void setList2(LinkedList<? super T> list2) {
        this.list2 = list2;
    }
}
public class Main {
    public static void main(String[] args){
        A<Integer> a = new A<>();
        if(a instanceof A<?>){
            System.out.println("таким образом можно использовать оператор instanceof с объектами параметризованных классов");
        }
    }
}
