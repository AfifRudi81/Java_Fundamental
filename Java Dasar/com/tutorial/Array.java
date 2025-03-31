package com.tutorial;
import java.util.*;

public class Array {
    public static void main(String[] args) {
//        tipe data array asigment
        int [] integerarray = {1,2,3,4};

        System.out.println(integerarray[2]);


//        array deklarasi
        System.out.println("Deklarasi Array");

        Scanner inputUser = new Scanner(System.in);
        int angka = inputUser.nextInt();

        float[] floatArray = new float[5];
        floatArray [0]= 11.1f;
        floatArray [1]= 11.2f;
        floatArray [2]= 11.3f;
        floatArray [3]= 11.4f;
        floatArray [4]= 11.5f;
        System.out.println("Deklarasi Array menggunakan float "+floatArray[angka]);
    }
}
