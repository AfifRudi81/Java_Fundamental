package com.tutorial;

public class ArrayPassByReference {
    public static void main(String[] args) {
//        method yang argumnetnya adalah reference

        int[] angka1 = {1,2,3,4,5};
        int[] angka2 = {6,7,8,9,10};

        System.out.println("deklarasi angka 1 = "+angka1 + "-> "+ angka1[1]);
        System.out.println("deklarasi angka 1 = "+angka2 + "-> "+ angka2[1]);

        angka1 = angka2; // setelah disamakan angka 2 juga ikut sama angka 1

        System.out.println("setelah disamanakan angka 1 = "+angka1 + "-> "+ angka1[1]);
        System.out.println("setelah disamanakan angka 2 = "+angka2 + "-> "+ angka2[1]);

//        jadi lebih berhati hati dengan array karena mengikuti dari arraynya
    }
}
