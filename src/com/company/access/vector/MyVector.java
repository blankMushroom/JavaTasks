package com.company.access.vector;

public class MyVector {
    protected double x;
    protected double y;// protected для инкапсуляции но с сохранением доступа для наследующих классов
    public MyVector(double x, double y){//Конструктор, public для доступа извне
        this.x = x;
        this.y = y;
    }
    public MyVector(){
        this.x = 0;
        this.y = 0;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){//Геттеры, public для доступа извне
        return this.y;
    }
    public void setParams(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void matchVector(MyVector a){
        this.x = a.getX();
        this.y = a.getY();
    }
    public void scalarMult(double scalar){
        this.y *= scalar;
        this.x *= scalar;
    }
    public void addVector(MyVector added){
        this.x += added.getX();
        this.y += added.getY();
    }

}
