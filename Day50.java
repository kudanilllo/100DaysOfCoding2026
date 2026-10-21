import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan bilangan yang ingin anda cek : ");
        num = scanner.nextInt();

        String keluaran = (num % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(keluaran);
    }
}

