import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka pertama: ");
                double a = input.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double b = input.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Hasil: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Hasil: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Hasil: " + (a / b));
                        } else {
                            System.out.println("Tidak bisa dibagi nol!");
                        }
                        break;
                }
            } else if (pilihan == 0) {
                System.out.println("Terima kasih, program selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
