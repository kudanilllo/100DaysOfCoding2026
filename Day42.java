import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        int gajiPokok;
        char golongan;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Gaji pokok\t:");
        gajiPokok = sc.nextInt();

        System.out.print("Golongan\t:");
        golongan = sc.next().charAt(0);

        int tunjangan = 0;
        if (golongan == '1') {
            tunjangan = gajiPokok * 10 / 100;
        } else if (golongan == '2') {
            tunjangan = gajiPokok * 20 / 100;
        } else if (golongan == '3') {
            tunjangan = gajiPokok * 30 / 100;
        } else {
            System.out.println("Golongan tidak valid!");
        }

        int gajiKotor = gajiPokok + tunjangan;

        int pajak;

        if (gajiKotor < 3000000) {
            pajak = 0;
        } else if (gajiKotor >= 3000000 && gajiKotor <= 5000000) {
            pajak = 5;
        } else {
            pajak = 10;
        }

        int pajakGaji = gajiKotor * pajak / 100;
        int gajiBersih = gajiKotor - pajakGaji;

        System.out.printf("""
                Tunjangan Jabatan\t:Rp%d
                Gaji kotor\t\t:Rp%d
                Pajak %d%%\t\t:Rp%d
                Gaji bersih\t\t:Rp%d
                    """, tunjangan, gajiKotor, pajak, pajakGaji, gajiBersih);
    }
}
