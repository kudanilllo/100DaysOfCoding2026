import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Bilangan genap");
        }else{
            System.out.println("Bilangan ganjil");
        }
    }
}
