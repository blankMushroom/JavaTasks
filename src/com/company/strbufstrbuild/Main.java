package com.company.strbufstrbuild;

public class Main {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder("abc12");//У StringBuilder/Stringbuffer есть 4 конструктора: без параметров - резервирует место для 16 символов. с параметром capacity резервирует место для capacity символов С параметров строка или набор символов - резервирует (длина строки + 16) символов и добавляет строку
        StringBuffer buffer = new StringBuffer(32);
        buffer.append("abc123");
        builder.append(3);//append - Присоединить аргумент к концу Буффера/Билдера
        System.out.println(buffer.capacity());
        System.out.println(builder.capacity());//capacity - Выдает количество зарезервированных мест.
        System.out.println(buffer.length());
        System.out.println(builder.length());//length - Выдает длину строки в буффере/билдере
        System.out.println(buffer.charAt(3));
        System.out.println(builder.charAt(3));//charAt - Выдает символ на указанном месте
        buffer.setCharAt(0,'z');
        builder.setCharAt(0,'z');//setCharAt - Поставить указанный символ на указанное место
        buffer.insert(3,"but");
        builder.insert(3,"but");//insert - Вставить аргумент (символ/число/строку) на указанное место и сдвинуть все после указанного места направо
        buffer.deleteCharAt(0);
        builder.deleteCharAt(0);//deleteCharAt - Удалить символ на указанном месте и сдвинуть все после этого символа на один влево
        buffer.ensureCapacity(buffer.length());
        builder.ensureCapacity(builder.length());//ensureCapacity - выделяет память под как минимум указанное число символов, возможно и больше.
        System.out.println(buffer.toString());
        System.out.println(builder.toString());//toString - Конвертирует буффер/билдер в строку
        //Строка в буффер/билдер конвертируется их конструктором.
        //Буффер в билдер и наоборот конвертируется конвертацией в строку и созданием нового объекта по этой строке.
    }
}
