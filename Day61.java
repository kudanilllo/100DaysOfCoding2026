import java.util.Scanner;

public class Day61{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan M: ");
        int m = input.nextInt();
        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }

        System.out.println(m + " pangkat " + n + " = " + hasil);
    }
}
