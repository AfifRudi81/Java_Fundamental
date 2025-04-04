package com.tutorial;
import java.io.FileOutputStream;
import  java.io.IOException;
import java.io.FileInputStream;

public class byteStream {
    public static void main(String[] args)throws IOException{
        FileInputStream inputStream = null;
//        inputStream = new FileInputStream("input.txt");
        inputStream = new FileInputStream("input.txt");

     int data = inputStream.read();

        while (data != -1){ //-1 berasal dari data yang lebih dari jumlah kata
            System.out.println((char) data);
            data = inputStream.read();
        }

        inputStream.close();
    }
}
