package com.tutorial;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) throws IOException {
//        ByteStream => FileInputStream
//        Character Stream => FileReader

        FileInputStream inputUser = new FileInputStream("file.txt");
        FileReader inputchar = new FileReader("file.txt");

        int data = inputUser.read();
        int data2 = inputchar.read();

        while (data!= -1 && data2 != -1){
            System.out.print((char) data);
            System.out.print((char) data2 );

            data = inputUser.read();
            data2 = inputUser.read();
        }

    }
}
