import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int a = in.nextInt();

        if (a > 0) {
            System.out.println(a + " adalah bilangan positif");
        } else if (a < 0) {
            System.out.println(a + " adalah bilangan negatif");
        } else {
            System.out.println("Bilangannya nol");
        }

        in.close();
    }
}
