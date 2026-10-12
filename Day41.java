import java.util.Scanner;;

public class Day41 {
    public static void main(String[] args) {
        int temperatur;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan temperatur:");
        temperatur = sc.nextInt();
        String suhu = "";
        if (temperatur < 16) {
            suhu = "Sangat dingin";
        } else if (temperatur >= 16 && temperatur <= 22) {
            suhu = "Dingin";
        } else if (temperatur >= 23 && temperatur <= 37) {
            suhu = "Normal";
        } else if (temperatur >= 28 && temperatur <= 32) {
            suhu = "Hangat";
        } else {
            suhu = "Panas";
        }
        System.out.printf("""
                Suhu ruangan\t:%d\u00B0C
                Kondisi\t\t:%s
                """, temperatur, suhu);

        sc.close();
    }
}
