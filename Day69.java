import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
