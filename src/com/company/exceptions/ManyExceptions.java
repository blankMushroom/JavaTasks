package com.company.exceptions;



public class ManyExceptions {
    // Базовое исключение
    public static class Ex1 extends Exception {
        public Ex1(String message) {
            super(message);
        }
    }

    // Ex2 наследует Ex1
    public static class Ex2 extends Ex1 {
        public Ex2(String message) {
            super(message);
        }
    }

    // Ex3 наследует Ex2
    public static class Ex3 extends Ex2 {
        public Ex3(String message) {
            super(message);
        }
    }
    // Пример метода, который может бросать разные исключения
    public static void riskyMethod(int level) throws Ex1 {
        switch (level) {
            case 1:
                throw new Ex1("Ошибка уровня 1");
            case 2:
                throw new Ex2("Ошибка уровня 2");
            case 3:
                throw new Ex3("Ошибка уровня 3");
            default:
                System.out.println("Все в порядке");
        }
    }
    public static void main (String[] args){
        try{
            if(args[0].equals("e")){
                System.out.println("e indeed");
            }else{
                throw new IllegalArgumentException();
            }

        } catch (IndexOutOfBoundsException | IllegalArgumentException e) {//И IllegalArgumentException и IndexOutOfBoundsException обрабатываются в одном блоке catch
            System.err.println("Error: invalid argument");
        }
        for (int i = 1; i <= 3; i++) {
            try {
                riskyMethod(i);
                // Обрабатываем самое специфичное исключение первым Ex3 -> Ex2 -> Ex1
            } catch (Ex3 e) {
                System.out.println("Пойман Ex3: " + e.getMessage());
            } catch (Ex2 e) {
                System.out.println("Пойман Ex2: " + e.getMessage());
            } catch (Ex1 e) {
                System.out.println("Пойман Ex1: " + e.getMessage());
            }
        }
    }
}
