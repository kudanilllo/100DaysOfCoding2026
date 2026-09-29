import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        int umur;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan umur anda: ");
        umur = sc.nextInt();

        if (umur == 18) {
            System.out.println("umur anda 18");

        } else if (umur != 18) {
            System.out.println("Umur anda bukan 18 Tahun");
        }

    }
}
