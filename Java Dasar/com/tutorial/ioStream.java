package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;

public class ioStream {
    public static void main(String[] args) throws IOException {
//        pengenalan i/o stream

        try{
            FileInputStream fileInput = new FileInputStream("input.txt");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
