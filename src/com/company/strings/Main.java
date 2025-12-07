package com.company.strings;

import java.util.Locale;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args){
        String str = "aBcDeF АмИгДаЛа 12345";
        System.out.println(str.toLowerCase());//делает все буквы строчными
        System.out.println(str.toUpperCase());//делает все буквы прописными
        System.out.println(str.charAt(5));//Выдает символ в строке на указанном месте.
        System.out.println(str.substring(0,6));//Выдает подстроку ограниченную указанными местами
        System.out.println(str.length());//Выдает длину строки
        System.out.println(str.lastIndexOf('а'));//Выдает последнее место в строке на котором находится указанный символ
        System.out.println(str.indexOf('F'));//Выдает первое место в строке на котором находится указанный символ
        System.out.println(str.compareTo("aBcDeF АмИгДаЛа 22345"));//Сравнивает две строки лексикографически. -1 если наша строка меньше другой, 1 если больше и 0 если равны
        System.out.println(str.endsWith("2345"));//Проверяет, является ли указанная строка концом нашей строки.
        System.out.println(str.equalsIgnoreCase("abcdef амигдала 12345"));//сравнивает нашу строку с указанной игнорируя регистр. true сли равны, false если нет
        StringJoiner sj = new StringJoiner(", ");//Класс StringJoiner озволяет просто конкатинировать несколько строк с определенным разделителем и суффиксом/префиксом (опционально)
        sj.add("abc");
        sj.add("def");
        sj.add("ghi");//Добавляем в StringJoiner строки которые необходимо сшить
        System.out.println(sj.toString());//Сшиваем их в одну строку с разделителями методом toString
    }
}
