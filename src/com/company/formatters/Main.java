package com.company.formatters;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer();
        Formatter f = new Formatter(buffer, Locale.ENGLISH);
        f.format("%b, %c, %d, %e, %f", true, 'a', 123, 123.456, 654.321);
        //%b - аргумент типа boolean, %с - аргумент типа char, %d - аргумент целочисленного типа, %e, %f - аргумент дробное число
        System.out.println(buffer);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();//берем нынешнюю дату и время
        buffer.setLength(0);//Удаляем все из буффера
        f.format("%2$tH, %2$tM, %2$tS, %1$td, %1$tm, %1$tY", date, time);
        //%2$tH - время в часах, принимает LocalTime, %2$tM  - время в минутах, принимает LocalTime, %2$tS - время в секундах, принимает LocalTime, %1$td - Дата в днях, принимает LocalDate, %1$tm - Дата в месяцах, принимает LocalDate, %1$tY - Дата в годах, принимает LocalDate
        System.out.println(buffer);
    }
}
