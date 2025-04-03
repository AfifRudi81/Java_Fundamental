package com.tutorial;

import java.util.Scanner;
import java.lang.String;

//Perlu diingat bahwa setiap ada perubahan string,biasanya akan disimpan di memory stirng pool,jadi
//lebih selektif untuk mempergunakannya

public class OperasiString {
    public static void main(String[] args) {
//        String
        String makanan = "suka buah pisang";
        System.out.println(makanan.charAt(5));

//        Substring
        System.out.println(makanan.substring(5,10));

//        Concatenation (penggabungan 2 string)
        String Siang = "makan "+ makanan;
        System.out.println(Siang);

//        Uppercase & Lowercase
        System.out.println(makanan.toLowerCase());
        System.out.println(Siang.toUpperCase());

//        Replace => merubah komponen string secara langsung
        String kalimatBaru = Siang.replace("makan","minum");
        System.out.println(kalimatBaru);

//        Equality => digunakan untuk melihat persamaan antar 2 buah string
//        untuk mengecek bahwa string itu sama biasanya dilihat dari addresnya,tulisannya sama
//        tetapi addressnya berbeda tetap akan bernilai berbeda,disimpan di string pool

        String namaMakanan1= "Donat";
        String namaMakanan2 = "Durian";

        System.out.println("apakah sama "+namaMakanan1.equals(namaMakanan2));


//        compare => digunakan untuk membandingkan mana yang lebih besar sesuai alfabet
        System.out.println("Berapa : "+namaMakanan2.compareTo(namaMakanan1));
    }
}
