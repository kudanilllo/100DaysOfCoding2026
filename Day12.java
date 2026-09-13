
import java.util.Scanner;


public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input user 
        System.out.print("Masukan Nama Lengkap anda: ");
        String nama = input.nextLine();

        System.out.print("Jenis Kelamin anda: ");
        String sex = input.nextLine();

        System.out.print("Masukan TempatTanggal Lahir anda: ");
        String ttl= input.nextLine();

        System.out.print("Masukan golongan darah anda: ");
        String darah = input.nextLine();
        char golDarah = darah.charAt(0);

        System.out.print("Masukan Daerah asal anda: ");
        String daerahAsal= input.nextLine();

        System.out.print("Agama anda: ");
        String agama = input.nextLine();

        System.out.print("Masukan Program studi anda: ");
        String prodi = input.nextLine();

        System.out.print("Hobbi anda: ");
        String hobbi = input.nextLine();

        System.out.print("Nomor telpon: ");
        String nomorTlp = input.nextLine();


        System.out.println("----------------------");
        System.out.println("====BIODATA MAHASISWA====");
        System.out.println("Nama Lengkap\t\t:" + nama);
        System.out.println("Tempa\\TanggalaLahira\t:" + ttl);
        System.out.println("Jenis kelamin\t\t:" + sex );
        System.out.println("Daerah asal\t\t:" + daerahAsal);
        System.out.println("Agama\t\t\t:" + agama);
        System.out.println("Program Studi\t\t:" + prodi);
        System.out.println("Hobbi\t\t\t:" + hobbi);
        System.out.println("Gol. Darah\t\t:" + golDarah);
        System.out.println("No. Handphone\t\t:" + nomorTlp);
        

    }
    
}
