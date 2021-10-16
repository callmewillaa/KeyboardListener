import java.io.IOException;
import java.util.Scanner;

public class InputOutputSederhana1 {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Masukkan satu huruf kemudian tekan ENTER");
        int myInput;
        myInput = System.in.read();

        System.out.println(("Huruf yang ditekan menjadi ASCII dengan kode = " +myInput));


         */

        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap Anda = ");
        String namaSaya = inputKeyboard.nextLine();
        System.out.println("Nama Lengkap Anda Adalah = " +namaSaya);

        System.out.println("\n");
        System.out.println("Masukkan Panjang dalam CM = ");
        double panjangPersegi = inputKeyboard.nextDouble();
        System.out.println("Nilai Panjang adalah = " + panjangPersegi);
        double hasilHitung = 0.75 * panjangPersegi;
        System.out.println("Hasil Hitung Setelah dikali 0.75 = " +hasilHitung);

    }
}
