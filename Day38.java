import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU KALKULATOR ===");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = in.nextInt();

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.print("Masukkan angka pertama: ");
            double x = in.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double y = in.nextDouble();

            if (pilihan == 1) {
                System.out.println("Hasil: " + (x + y));
            } else if (pilihan == 2) {
                System.out.println("Hasil: " + (x - y));
            } else if (pilihan == 3) {
                System.out.println("Hasil: " + (x * y));
            } else {
                if (y == 0) {
                    System.out.println("Tidak bisa dibagi nol");
                } else {
                    System.out.println("Hasil: " + (x / y));
                }
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }

        in.close();
    }
}
