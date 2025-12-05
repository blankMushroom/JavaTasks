package com.company.operators;
class A{
}
class B extends A{
}
public class Main {
    public static void main(String[] args) {
        int a = 0;
        a += (100 + 40 * 32 / 12) % 34 << 2 >> 2;//a = 2, >>, << - смещение битов с сохранением знака >>> смещение битов без сокращения знака.
        a -= 13;//a = -11 минус 13
        a *= 12;//a = -132 умножение на 12
        a /= 3;//a = -44 деление на 3
        a %= 10;// a = -4 остаток от деления на 10
        boolean b = ((a != -3) && (a >= 4) ^ (a > 2*a) & !(a < -3) | (a <= a + 1)) || (a == -4);//b = true, && || - логическое И, ИЛИ с сокращением, ! - НЕ, & | ^ - побитовое И, ИЛИ, XOR без сокращения. == <= >= < > сравнение.
        int c = b ? a++ : --a;// a = -3, c = -4, если b было бы false, то a = c = -5
        Integer d = Integer.valueOf(~a);//a = -3 = 11111111111111111111111111111101b, d = ~a = 10b = 2
        String str = "a = " + a + "c = ";
        str += c;//конкатенация
        b = d instanceof Integer;//b = true
        B obj = new B();
        b = obj instanceof A;//b = true
        obj = null;
        b = obj instanceof B;//b = false, null не является объектом никакого типа.
    }
}
