public class Day60 {
    public static void main(String[] args) {
        // Outer loop: mengatur baris
        for (int baris = 1; baris <= 3; baris++) {
            // Inner loop: mengatur kolom
            for (int kolom = 1; kolom <= 3; kolom++) {
                System.out.print("* ");
            }
            System.out.println(); // pindah ke baris berikutnya
        }
    }
}
