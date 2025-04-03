package com.tutorial;

import java.util.Formatter;

public class formatString {
    public static void main(String[] args) {

        String nama = "udin";
        int umur = 23;

//        Penulisan biasanya
        System.out.println("Nama saya adalah "+nama+", Sekarang saya berumur "+umur);

//        menggunakan format string
        System.out.printf("Nama saya adalah %s, dan saya sekarang berumur %d",nama,umur);


//        Conversition format string = d => integer
//                                 f=>floating point (double juga bisa)
//                                 s=>String
//                                 b=>boolean
//                                 c=>character
//    struktur format => %[argument index][flags][width][.precision ]
//    %convertion
        /*struktur format => - Argument index $
         * */
//    nama saya udin,umur udin adalah 23 tahun
        System.out.printf("nama saya %1$s, umur %1$s adalah %2$d tahun\n",nama,umur);

        /*struktur format => - Flags
        flags akan terasa apabila ada width
         * */
        int int3 = 55;
        System.out.printf("%d\n",int3);
        /*struktur format => - Width
         * */
        System.out.printf("%-5d\n",int3);//5 adalah widthnya
        //- adalah flags => berfungsi untuk rata kiri &
        System.out.printf("%+5d\n",int3);
        //tambahkan 0 untuk menambahkan leading & 0 tidak akan dijadikan flags
        System.out.printf("%05d\n",int3);
        /*struktur format => - . (precision)
         * */

        //floating point biasa tanpa precision tidak akan berpengaru, kecuali width melebihi 6 decimal
        float float2 = 1.682f;

        System.out.printf("%4f\n",float2);//pasti widthnya tidak berhasil
        System.out.printf("%05.2f\n",float2); //dengan precision width bisa beroperasi(0 adalah leading,5 adalah width)
        // 4d dan 2f merupakan jumlah angkan dibelakang koma dan diberlakukan pemblatan ke atas setiap 5 keatas.

        String jeneng = "Afif";
        float IPK = 3.812357365723f;

        System.out.printf("Nama saya adalah %s, dan IPK saya adalah %2$+5.2f \n",jeneng,IPK);

//        untuk memasukknan kedalam string biasa menggunakan => String nama = String.format()

        //kalau String Builder menggunakan

        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama saya %s, IPK saya%2$5.2f",jeneng,IPK);
        System.out.println(formatBuilder);
    }
}
