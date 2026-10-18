import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        int hari;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan hari : ");
        hari = sc.nextInt();

        switch (hari) {
            case 1, 2, 3, 4, 5:
                System.out.println("Hari kerja");
                break;
            case 6, 7:
                System.out.println("Hari libur");
                break;
            default:
                System.out.println("Hari tidak valid!");
                break;
        }

    }
}


