
import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama\t\t:");
        String nama = input.nextLine();

        System.out.print("Umur\t\t:");
        int umur = input.nextInt();

        System.out.print("Tinggi\t\t:");
        double tinggi = input.nextDouble();

        System.out.print("Berat Badan\t:");
        double bb = input.nextDouble();
        input.nextLine(); //buffer

        System.out.print("Jenis kelamin\t:");
        char sex = input.nextLine().charAt(0);

        System.out.print("No. Telpon\t:");
        String noTlpn = input.nextLine();

        System.out.println("----BIODATA SAYA----");
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Umur\t\t:" + umur + " Tahun");
        System.out.println("Tinggi\t\t:" + tinggi + "cm");
        System.out.println("Berat Badan\t:" + bb + "kga");
        System.out.println("Jenis kelamin\t:" + sex);
        System.out.println("No. Telpon\t:" + "+62" + noTlpn);



    }
}
