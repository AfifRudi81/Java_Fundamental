package com.tutorial;

public class sString {
    public static void main(String[] args) {
        String nama = "Hello Semuanya";

        System.out.println(nama + " pemanggilan nama biasa menggunakan strring");
        System.out.println(nama.charAt(2)+" pemanggilan character yang ada dalam kata tersebut");

//        String di java itu tidak bisa dirubah karena immutabel
//        untuk bisa menambahkan komponen kepada string bisa,tetapi secara tidak langsung,menggunakan
//        substring->hampir mirip seperti charat tetapi ada range nya

        String namaTambahan = "nana"+ nama.substring(2,5);
        System.out.println(namaTambahan + "<- ini nama tambahannya");
    }
}
