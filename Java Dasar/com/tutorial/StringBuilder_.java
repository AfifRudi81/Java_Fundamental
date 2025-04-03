package com.tutorial;

public class StringBuilder_ {
    public static void main(String[] args) {
//        string builder => hampir sama seperti String pada biasanya,bedanya
//        -String ada perubahan disimpan di String pool,
//        kalau stringbuilder ada namanya capacity dan bisa terus berkembang,jadi lebih fleksibel

        StringBuilder builder = new StringBuilder("hallo");

        System.out.println(builder);
        System.out.println(builder.capacity());//capistas String builder adalah 16
        System.out.println(builder.length());

        int addresBuilder = System.identityHashCode(builder);
        System.out.println(Integer.toHexString(addresBuilder));

//        Append => berfungsi seperti concat tetapi tidak merubah addres awal,tidak disimpan kedalam stringpool

        StringBuilder tambahan = builder.append("Semuanya apa kabar");
        System.out.println(tambahan);

//        insert =>berfungsi untuk menambahkan string kedalam sebuah index
        tambahan.insert(23,"belajar");
        System.out.println(tambahan);

//        delete => berfungsi untuk menghapus
        tambahan.delete(18,23);
        System.out.println(tambahan);

//        setCharAt => berfungsi untuk merubah sebuah character pada sebuah index
        tambahan.setCharAt(0,'j');
        System.out.println(tambahan);

//        replace => digunakan untuk merubah kata menggunakan index
        tambahan.replace(0,5,"kamu ");
        System.out.println(tambahan);
    }
}
