package com.tutorial;

import java.util.Arrays;

public class LatihanArray2Dimensi {
    public static void main(String[] args) {
        //penjumlahan matrix

        int[][] a={{1,2,3},
                    {4,5,6},
                {7,8,9}};
        int[][] b={{11,12,13},
                {14,15,16},
                {17,18,19}};

        int[][] Hasil = new int[a.length][a[0].length];

        for(var i=0;i<a.length;i++){
            for(var j=0;j<a[i].length;j++){
                Hasil [i][j] = a[i][j] + b [i][j];
            }
        }
        System.out.println("Matriks Penjumlahan");
        System.out.println(Arrays.deepToString(Hasil));

//        Matriks Perkalian

        
    }

}
