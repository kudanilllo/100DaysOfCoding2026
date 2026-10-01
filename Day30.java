import java.util.Scanner;

public class Day30 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama (a): ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua (b): ");
        int b = input.nextInt();

        System.out.println("\n=== Hasil Perbandingan ===");

        // Contoh penggunaan dengan if-else
        if (a <= b) {
            System.out.println("a lebih kecil atau sama dengan b");
        }

        if (a >= b) {
            System.out.println("a lebih besar atau sama dengan b");
        }

        input.close();
    }
}
