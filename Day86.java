import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] nilai = {18,16,50,};
        

        System.out.print("Masukan index yang ingin anda cari (index di mulai dari 0 - " + (nilai.length-1) + " : ");
        int n = sc.nextInt();

        System.out.println("Nilai dari index "+ n +" adalah : "+nilai[n]);

    }
}
