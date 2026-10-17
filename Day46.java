
import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    ==== MENU MAKAN ===
                    1. Ayam bakar
                    2. Nasi goreng
                    3. Pisang keju
                """);
        System.out.print("Masukan Pilihan :");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Pesanan Ayam bakar anda sedang di kerjakan...");
                break;
            case 2:
                System.out.println("Pesanan \"Nasi goreng\" anda sedang di kerjakan...");
                break;
            case 3:
                System.out.println("Pesanan Pisang keju anda sedang di kerjakan...");
                break;
            default:
                throw new AssertionError();                
        }
        sc.close();

    }
}
