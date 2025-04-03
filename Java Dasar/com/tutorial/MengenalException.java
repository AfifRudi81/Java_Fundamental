package com.tutorial;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class MengenalException {
//    Exception Handling => menggunakan try \ catch \ finaly
public static void main(String[] args) {
   int[] number={1,2,3,4};
    Scanner userInput = new Scanner(System.in);
   int index = userInput.nextInt();

   try{
       System.out.printf("index ke- %d adalah %d\n",index, number[index]);
   }catch (Exception e){
       System.out.println(e);
   };
    System.out.println("ini akan tetap berjalan");


//    runtime err jika file tidak berjalan
    FileInputStream fileInput = null;

    try{
        fileInput = new FileInputStream("input.txt");
    }catch(Exception e) {
        System.err.println(e);
    };
}
}
