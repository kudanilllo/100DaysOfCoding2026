public class Day71 {
    public static void main(String[] args) {
        for(int baris = 0; baris < 5; baris++){
            System.out.print(baris + " ");
            for (int i = 0; i < baris; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
