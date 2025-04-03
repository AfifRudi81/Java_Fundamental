package com.tutorial;

import java.util.Scanner;

public class ExceptionMethod {
    public static void main(String[] args) {
//        Exception Biasa
        int[] Array ={1,2,3,4};
        Scanner inputUser = new Scanner(System.in);
        int index = inputUser.nextInt();

        try{
            System.out.printf("index ke- %d adalah %d\n\n",index,Array[index]);
        }catch (Exception e){
            System.err.println(e);
        }

        int data = Indexx(Array,index);

        System.out.printf("Baru dalam method=> indek ke %d adalah %d\n\n",index,data);

        System.out.println("akhir dari program");
    }

//    Exception menggunakan sebuah method

    public static int Indexx(int[] Arrays,int index){
        int hasil = 0;

        try{
            hasil = Arrays[index];
        }catch (Exception e){
            System.err.println(e);
        }

        return hasil;
    }
}
