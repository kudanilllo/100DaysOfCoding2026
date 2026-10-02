public class Day31 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println();

        // AND (&&): true jika KEDUANYA true
        System.out.println("a && b = " + (a && b));

        // OR (||): true jika SALAH SATU true
        System.out.println("a || b = " + (a || b));

        // NOT (!): membalik nilai
        System.out.println("!a     = " + !a);
        System.out.println("!b     = " + !b);

        // Contoh nyata
        int umur = 20;
        boolean punyaKTP = true;

        if (umur >= 17 && punyaKTP) {
            System.out.println("\nBoleh ikut pemilu");
        }
        if (umur < 17 || !punyaKTP) {
            System.out.println("Belum boleh ikut pemilu");
        }
    }
}
