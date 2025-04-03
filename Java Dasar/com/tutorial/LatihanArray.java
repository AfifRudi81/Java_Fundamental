package com.tutorial;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import static java.util.Collections.*;

public class LatihanArray {
//    penjumlahan 2 buah array
    public static void main(String[] args) {
        int[] arrayangka = {1, 3, 4, 5, 6, 2, 43, 12, 10};
        int[] arrayangka1 = {2, 5, 7, 4, 3, 6, 3, 5, 7,};

int[] arrayHasil = tambahArray(arrayangka,arrayangka1);

Integer[] arraygabung = new Integer[arrayangka.length + arrayangka1.length];

        System.out.println(arraygabung);
//menguruttkan dari besar ke kecil
        Arrays.sort(arraygabung,Collections.reverseOrder());
//menggabungkan 2 buah array
        for(int i =0;i<arrayangka.length;i++){
            arraygabung [i] = arrayangka [i];

        };
        for(int j=0;j<arrayangka1.length;j++){
            arraygabung[j+arrayangka.length] = arrayangka1[j];
        };



        printArray(arrayHasil,"arraynya sepeti ini");


    };

    private static int[] tambahArray(int[] array1,int[] array2){
            int[]numb = new int[array1.length];//untuk memasukan bilangan ke sebuah array
            for(var i=0;i<array1.length;i++){
                numb[i] = array1[i]+array2[i];
            }
            return numb;
    };


    private static void printArray(int[] dataArray,String Message){
        System.out.println("Array "+Message+Arrays.toString(dataArray));

    };
};
