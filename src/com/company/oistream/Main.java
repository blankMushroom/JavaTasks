package com.company.oistream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Пожалуйста введите путь к файлу:");
        String filepath = s.nextLine();
        try (FileInputStream file = new FileInputStream(filepath)){
            System.out.println("Файл содержит:");
            int ch;
            while ((ch = file.read())!=-1){
                System.out.print((char)ch);
            }
            file.close(); //Не нужно т.к. FileInputStream  имплементирует AutoCloseable
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден: Убедитесь что правильно указан путь");;
        }catch (IOException e){
            System.out.println("Во время чтения файла произошла ошибка.");
        }
        System.out.println("Пожалуйста введите путь к новому файлу:");
        String newfilepath = s.nextLine();
        try(FileOutputStream newfile = new FileOutputStream(newfilepath)){
            int data = 1234;
            newfile.write(data);
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден: Убедитесь что правильно указан путь");;
        }catch (IOException e){
            System.out.println("Во время чтения файла произошла ошибка.");
        }
    }
}
