package com.company.overrideeq;
class MyVector{
    private double x;
    private double y;
    public MyVector(double x, double y){//Конструктор
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object o){//метод equals возвращает boolean, принимает Object
        if (o==this){
            return true;
        }
        if(!(o instanceof MyVector)){
            return false;
        }
        MyVector v = (MyVector) o;
        return Double.compare(x,v.x) == 0 && Double.compare(y,v.y)==0;
    }
}
public class Main {
    public static void main(String[] args){
        MyVector v1 = new MyVector(3,5);
        MyVector v2 = new MyVector(3,5);
        if (v1.equals(v2)){
            System.out.println("векторы равны");
        }
    }
}
