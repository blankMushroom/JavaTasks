package com.company.console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите имя:\n");
        String name = s.nextLine();
        System.out.println("Привет, " + name);
    }
}
