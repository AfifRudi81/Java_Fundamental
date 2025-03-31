package com.tutorial;

import java.util.Arrays;

public class ForEachArray {
    public static void main(String[] args) {

        int [] angka = {11,12,13,14,15,16,17,18,19,20};

//        menggunakan looping sederhana
        for (int i = 0;i<10;i++){
            System.out.println("kamu menghasilkan array index = "+i+" dengan angka array = "+angka[i]);
        }

//        menggunakan forEach Untuk Looping => digunakan saat tidak butuh looping angka index array
        for(int arrayAngka : angka ){
            System.out.println(arrayAngka);
        }
    }
}
