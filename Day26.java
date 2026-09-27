

import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        long total, tarik, batas = 0;

        Scanner sc = new Scanner(System.in);

        total = sc.nextInt();
        tarik = sc.nextInt();
        if (total < tarik) {
            batas = total;

        } else if (total > tarik) {
            batas = tarik;
        }

        long berhasil = (batas / 100000) * 100000;
        long lembar = berhasil / 100000;
        long sisa = tarik - berhasil;

        System.out.println("Berhasil di tarik\t: Rp"+berhasil);
        System.out.println("Jumlah lembar 100rb\t: "+lembar+" lembar");
        System.out.println("Gagal di tarik\t\t: Rp"+sisa);
    }
}
