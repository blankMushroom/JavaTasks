package com.company.exceptions;
class A{
    public int a;
}
class B extends A{}
class C extends A{}
public class Main {
    public static void main(String[] args){
        int a = 4;
        int b = 0;
        try{
            System.out.println(a/b);//Делим на 0 - ArithmeticException
        }catch (ArithmeticException e){//Ловим
            System.out.println("Недопустимая арифметическая операция");
        }
        int[]arr = {1,2,3,4};
        try{
            System.out.println(arr[a]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Попытка доступа к элементу вне границ массива");
        }
        try {
            Thread.sleep(-10); //Пытаемся подождать -10 мс
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            System.out.println("Незаконный аргумент");
        }
        A bobj = new B();//Создаем объект класса B как объект класса A
        try{
        C cobj = (C) bobj;//Пытаемся кастить его в объект класса C, не совместимый с классом B
        }
        catch (ClassCastException e){
            System.out.println("Попытка перевести в несовместимый тип");
        }
        bobj = null;
        try{
            System.out.println(bobj.a);
        }catch (NullPointerException e){
            System.out.println("Попытка доступа к пустому объекту");
        }
    }
}
