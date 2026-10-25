import java.util.Scanner;

public class SoalIcl {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int b = n;
        for (int i = 0; i < b; i++) {

            n += i;

        }

        System.out.println(n);
    }
}
