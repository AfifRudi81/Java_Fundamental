package com.tutorial;

import java.util.Arrays;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
//        Array multi dimensi merupakan => banyak dimensi array didalam satu variabel

//        array 2 dimensi
        int[] []array_1d ={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(array_1d));//untuk mengakses lebih dalam pada array

        int[][] angka2d = new int[5][4];//5 baris dan 4 kolom
        System.out.println(Arrays.deepToString(angka2d));

//        looping array 2 dimensi
        System.out.println("Looping array 2 dimensi");
        for(int i=0;i<angka2d.length;i++){
            System.out.print("[");
            for(int j=0;j<angka2d[i].length;j++){
                System.out.print(angka2d[i][j]+",");
            }
            System.out.println("]\n");
        }

//        Looping menggunakan ForEach
        System.out.println("looping menggunakan for each");
        for(int[] number : angka2d){
            System.out.print("[");
            for (int kolom : number){
                System.out.print(kolom+",");
            }
            System.out.println("]\n");
        }
    }
}
