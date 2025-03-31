package com.tutorial;

public class OverloadMethod {
    public static void main(String[] args) {
// satu nama fungsi bisa digunakan untuk beberapa nama argument

//        menggunakan 2 arguments
        int hasilPenjumlahan;
        hasilPenjumlahan = angkaAll(10,5);
        System.out.println("Hasil Penjumlahannya adalah " + hasilPenjumlahan);



//menggunakan 1 argument
        angkaAll(10);
        angkaAll(10.5f);
        angkaAll(11.2d);

    }
    private static int angkaAll(int arg1,int arg2){
return arg1 + arg2;
    }

    private static void angkaAll(int angka){
        System.out.println("ini adalah angka "+ angka );
    }
    private static void angkaAll(float angka){
        System.out.println("ini adalah angka "+ angka );
    }
    private static void angkaAll(double angka){
        System.out.println("ini adalah angka "+ angka );
    }
}
