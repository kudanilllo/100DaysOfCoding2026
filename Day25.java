import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        double jari, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jari-jari:");
        jari = sc.nextDouble();

        if (jari <= 0) {
            System.out.println("jari-jari tidak valid!");
        } else if (jari > 0) {
            area = Math.PI * (jari * jari);
            if (area < 50) {
                System.out.printf("Area: %.2f \"Lingkaran Kecil\"", area);
            } else if (area >= 50 && area <= 200) {
                System.out.printf("Area: %.2f \"Lingkaran Sedang\"", area);
            } else if (area > 200) {
                System.out.printf("Area: %.2f \"Lingkaran besar\"", area);
            }
        }
    }
}
