public class TipeDataArray {
    public static void main(String[] args) {
        // array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
        // jumlah data di array tidak bisa berubah setelah pertama kali dibuat

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0]="kamu bisa";
        arrayString[1]="kamu kuat";
        arrayString[2]="kamu hebat";
        
        long[] arrayLong ={
            10,20,30,40
        };

        System.out.println(arrayString[1]);
        System.out.println(arrayLong[1]);
    }
}
