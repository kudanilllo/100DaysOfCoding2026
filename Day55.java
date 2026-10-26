import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = n; i > 1; i--) {
            System.out.print(i + " ");
        }

    }
}

