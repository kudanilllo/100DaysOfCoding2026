import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        int inTugas, inUjian;
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan Nilai Tugas\t:");
        inTugas = sc.nextInt();
        System.out.print("Masukan Nilai Ujian\t:");
        inUjian = sc.nextInt();

        boolean tugasLulus = inTugas >= 60;
        boolean ujianLulus = inUjian >= 60;

        boolean lulus = tugasLulus && ujianLulus;
        boolean remidial = tugasLulus != ujianLulus;
        boolean sempurna = inTugas == 100 && inUjian == 100;

        System.out.println("-----------------------");
        System.out.println("Lulus          : " + lulus);
        System.out.println("Tidak lulus    : " + !lulus);
        System.out.println("Perlu remedial : " + remidial);
        System.out.println("Nilai sempurna : " + sempurna);

        if (lulus) {
            System.out.println("Selamat Kamu lulus!!");
        } else if (inTugas < 60 && inUjian < 60) {
            System.out.println("Tugas dan Ujian Anda Belum Tuntas!!");
        } else {
            System.out.println("Ikut remidial buat yang belum Tuntas");
        }

    }
}
