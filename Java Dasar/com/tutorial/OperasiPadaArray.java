package com.tutorial;
import java.util.*;
import java.util.Arrays;

import static java.util.Collections.*;

public class OperasiPadaArray {
    public static void main(String[] args) {

        int[] angka ={1,2,3,4,5};

        ArrayString(angka);//merubah angka menjadi string
//        mengkopi array ke array menggunakan sebuah looping
        System.out.println("mengkopi aray ke array menggunakan looping");
        int[] angka2 = new int[5];


        for(int i =0; i<angka.length;i++){
            angka2[i] = angka[i];
        }
        ArrayString(angka);
        System.out.println(angka);
        ArrayString(angka2);
        System.out.println(angka2);


        System.out.println("mengkopi array menggunakan copyOf");
        int[] angka3 = Arrays.copyOf(angka,5);
        ArrayString(angka3);
        System.out.println(angka3);

        System.out.println("mengkopi array dari index keberapa menggunakan copyOfRange");
        int[] angka4 = Arrays.copyOfRange(angka,2,5);
        ArrayString(angka4);
        System.out.println(angka4);

        System.out.println("isi array menjadi benilai sama semua menggunakan => fill array");
        int[] angka5 = new int[10];//dengan panjang array 10
        Arrays.fill(angka5,1);//berisikan angka 1
        ArrayString(angka5);


//        komparasi array digunakan untuk mebandingkan 2 array => menggunakan equals
        int[] angka6 = {1,2,3,4,5};
        int[] angka7 = {1,2,3,4,9};

        if(Arrays.equals(angka6,angka7)){
            System.out.println("angka ini sama");
        }else{
            System.out.println("angka ini berbeda");
        }

        //    untuk mengecek array mana yang lebih besar => menggunakan array compare

        System.out.println(Arrays.compare(angka6,angka7));

//        untuk mengecek index mana yang berbeda menggunakan mismatch

        System.out.println(Arrays.mismatch(angka7,angka6));

//        untuk melakukan binary search lebih baik menggunakan sort terlebih dahulu
        int [] angka8 = {3,23,12,1,5,7};
        Arrays.sort(angka8);
        ArrayString(angka8);

//    untuk men-search sebuah array = menggunakan binary search
        int number = 23;
        int angkaarr = Arrays.binarySearch(angka8,number);
        System.out.println("jadi letak angka "+number+" berada di index "+angkaarr);

//        tugas : sort kebalik
        System.out.println("melakukan sort secara terbalik");
        Integer [] numb ={12,23,84,11,1,123};
//        numb adalah array tipe primitif (int[]), sedangkan Collections.reverseOrder() memerlukan Integer[] (bukan int[]).
        Arrays.sort(numb, Collections.reverseOrder());
        System.out.println(Arrays.toString(numb));

//        int[] tidak bisa langsung digunakan dengan Collections.reverseOrder(), harus diubah ke Integer[].
//
//String[] bisa langsung digunakan dengan Collections.reverseOrder(), karena String adalah objek.

//        operasi tambah antar dua buah array
//        menghubungkan dua buah array
    };




//    merubah intger menjadi sebuah string
    private static void ArrayString(int[] angkaArray){
        System.out.println("array " + Arrays.toString(angkaArray));

    }

}
