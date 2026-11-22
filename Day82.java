import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nilai = new int[n];

        int max = nilai[0];

        for (int i = 0; i < n; i++) {
            nilai[i] = sc.nextInt();
            if (nilai[i] > max) max = nilai[i];
        }

        System.out.println(max);
    }
}
