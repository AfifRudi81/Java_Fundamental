public class switchStatment {
    public static void main(String[] args) {
        var nilai = "C";

        switch(nilai){
            case "A" :
            System.out.println("yeay,kamu lolos dalam ujian ini");
            break;
            case "B" :
            case "C":
            System.out.println("kamu lolos pada tugas ini");
            break;
            default:
            System.out.println("kamu bisa mengulang pada bulan yang akan datang");
        }
    }

    // atau bisa menggunakan switch lamda (->) contoh : case "A"->System.Out.Println("wow kamu berhasil") =>fitur ini mulai aktif di java 14
}
