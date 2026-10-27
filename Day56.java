import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {

                System.out.print(i + " ");

            }
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }

        sc.close();

    }
}
