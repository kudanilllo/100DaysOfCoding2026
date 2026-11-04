

import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        System.out.print("Masukan bilangan yang ingin di faktroial:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        long faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;

        }
        System.out.println("Faktorial dari " + n + " Adalah: " + faktorial);
    }
}
