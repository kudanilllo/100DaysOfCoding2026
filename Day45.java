
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        System.out.print("Masukan hari yang ingin di cek:");
        Scanner sc = new Scanner(System.in);

        String hari = sc.next();

        switch (hari.toLowerCase()) {
            case "senin", "selasa", "rabu", "kamis", "jumat":
                System.out.println("Hari kuliah");
                break;
            case "sabtu", "minggu":
                System.out.println("Hari libur");
                break;
            default:
                System.out.println("Hari anomali");
                break;
        }
        System.out.println();
    }
}
