public class Day29 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println(a + " lebih besar dari " + b);
        } else if (a < b) {
            System.out.println(a + " lebih kecil dari " + b);
        } else {
            System.out.println("Kedua angka sama");
        }

        // Hasil langsung berupa boolean
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
    }
}
