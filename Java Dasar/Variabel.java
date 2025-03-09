public class Variabel {
    // satu variabel untuk 1 tipe data
    public static void main(String[] args) {
        String belajar;
        belajar ="Saya Sekarang Sedang mempelajari Java secara sungguh-sungguh";

        // saat menggunakan var untuk membuat sebuah variabel,kita harus menginisiasi value / nilai tersebut secara langsung
        var learning = "hallo semuanya";
        final String kamuA = "tidak belajar sekarang";

        // penggunaan kata kunci final =>value tidak bisa dirubah kembali,seperti const di javascript

        // tipe data bukan primitif
        // tidak memiliki default value dan bernilai null

        // cara merubah tipe data primitif ke bukan primitif
        int number = 1000;

        Integer number2 = number;
        Integer iniObject= number2;

        // untuk memanggil method bisa menggunakan (.)titik
        short number3 = iniObject.shortValue();


        System.out.println(belajar);
        System.out.println(learning);
        System.out.println(number2);
        System.out.println(number3);
    }
}
