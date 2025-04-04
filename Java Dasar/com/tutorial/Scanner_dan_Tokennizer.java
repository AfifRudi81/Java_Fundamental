package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Scanner_dan_Tokennizer {
    public static void main(String[] args) throws IOException {
        FileReader user = new FileReader("file.txt");
        BufferedReader bud = new BufferedReader(user);

//        Scanner scan = new Scanner(bud);
//        scan.useDelimiter(" "); // digunakan untuk mengatur delimeter(jarak pembatas,seperti spasi) bisa diganti dengan yang lain
//
//        System.out.println(scan.next()); //kalau pakai scan bisa diambil perkata
//        System.out.println(scan.next());
//        System.out.println(scan.next());
//        System.out.println(scan.next());
//        System.out.println(scan.next());
//        System.out.println(scan.next());
//        System.out.println(scan.hasNext());//digunakan apakah ada kata lagi? true / false
//
//

//        kalau ingin membaca perbaris bisa menggunakan String Tokenizer

        String data;
        data = bud.readLine();

        System.out.println(data);

        StringTokenizer token = new StringTokenizer(data," ");
        System.out.println(token.nextToken());
    }
}
