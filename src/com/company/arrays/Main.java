package com.company.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[]a={4,3,2,5,1};
        System.out.println(Arrays.toString(a)+ " toString преобразует массив в строку.");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)+ " sort сортирует массив от меньшего к большему значению");
        System.out.println(Arrays.binarySearch(a, 4) + " binarySearch находит номер заданного элемента (в данном случае - 4) в отсортированном массиве");
        int[]b={3,1,2};
        System.out.println(Arrays.toString(b)+ " Рассмотрим массив b");
        System.out.println(Arrays.equals(a,b) + " equals сравнивает массивы по содержанию. Если они совпадают, возвращается true, иначе - false");
        System.out.println(Arrays.compare(a,b) + " compare сравнивает массивы лексикографически. Если первый массив меньше второго, возвращается отрицательное число, если больше - положительное, если они равны - 0");
    }
}
