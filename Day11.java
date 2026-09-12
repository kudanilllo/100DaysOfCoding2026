
import java.util.Scanner;

public class Day11 {

    public static void main(String[] args) {

        int min = 100; //nilai awal untuk di bandingkan
        int max = 0;   //nilai awal untuk di bandingkan

        Scanner masuk = new Scanner(System.in);

        System.out.print("Jumlah Angka: "); //meminta input user
        int jumlah = masuk.nextInt(); //menrima input user yang akan di masukan ke dalam variable bernama jumlah

        System.out.println("-----------------");


        //loop perulangan meminta angka yang akan di cari nilai terbesar dan terkecil nya
        for (int i = 1; i <= jumlah; i++) {
            //menentukan jumlah angka yanga akan di masukan
            System.out.print("Angka ke-" + i + " = ");
            int angka = masuk.nextInt();

            //mencari angka terbesar
            if (angka > max) {
                max = angka;
            }
            if(angka < min){
                min = angka;
            }

        }

        //output 
        System.out.println("-----------------");
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);

    }

}
