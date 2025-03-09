public class doWhileLoop {
    // dicek setelah melakukan perulangan, akan melakukan perulangan 1x padahal bernilai false
    public static void main(String[] args) {
        var counter = 11;
        
        do{
            System.out.println("Yeay kamu Lanjut ke level selanjutnya " + counter);
            counter++;
        }while(counter<=10);
    }
}
