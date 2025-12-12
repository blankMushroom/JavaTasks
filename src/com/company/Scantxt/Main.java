package com.company.Scantxt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sysin = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String path = sysin.nextLine();
        File file = new File(path);
        try {
            Scanner scanfile = new Scanner(file);
            while(scanfile.hasNextLine()){
                System.out.println(scanfile.nextLine());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
