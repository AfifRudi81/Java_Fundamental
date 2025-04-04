package com.tutorial;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedCharacter {
    public static void main(String[] args) throws IOException {

//        menggunakan buffred

        FileReader input = new FileReader("file.txt");
        BufferedReader user = new BufferedReader(input);
        user.mark(200);

        String data = user.readLine();//ini untuk membaca langsung semuanya
        System.out.println(data);

        user.reset();

        System.out.println((char) user.read());//ini untuk membaca per character
    }
}
