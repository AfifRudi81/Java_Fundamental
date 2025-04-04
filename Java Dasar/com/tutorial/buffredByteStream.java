package com.tutorial;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class buffredByteStream {
    public static void main(String[] args)throws IOException {

//        ini membaca dari file
        FileInputStream inputStream = new FileInputStream("buffredbyte.txt");

        System.out.println(inputStream.available()); // .available() => digunakan untuk melihat banyak character didalamnya

        inputStream.close();
//        ini membaca dari ram/memory
        FileInputStream baca = new FileInputStream("buffredbyte.txt");
        BufferedInputStream baca2 = new BufferedInputStream (baca);

        int data = baca2.read();

        System.out.println(baca2.read());
    }
}
