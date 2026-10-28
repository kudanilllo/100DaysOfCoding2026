import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("kelipatan : ");
        m = sc.nextInt();
        System.out.print("Range : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }
}
