import java.util.Scanner; 

public class Day44 {
    public static void main(String[] args) {
        int nilai;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai >= 90) {
                System.out.println("Grade: A");
            } else if (nilai >= 80) {
                System.out.println("Grade: B");
            } else if (nilai >= 70) {
                System.out.println("Grade: C");
            } else if (nilai >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Nilai tidak valid!");
            return;
        }

    }
}
