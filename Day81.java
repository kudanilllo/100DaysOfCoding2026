import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nilai = new String[4];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan Nama teman : ");
            nilai[i] = sc.nextLine();
        }
        System.out.println("\n");
        for (String nama : nilai) {
            System.out.println("Nama Teman saya : " + nama);
        }
    }

}
