import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        String hari;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan hari : ");
        hari = sc.next();
        switch (hari.toLowerCase()) {
            case "senin", "selasa", "rabu", "kamis", "jumat":
                System.out.println("Hari kerja");
                break;
            case "sabtu", "minggu":
                System.out.println("Hari libur");
                break;
            default:
                System.out.println("Hari tidak valid!");
                break;
        }

        sc.close();
    }
}
