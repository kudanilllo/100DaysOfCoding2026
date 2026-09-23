public class Day22 {
    public static void main(String[] args) {
        int a = 5, c = 10, e = 10;
        int b = 10, d = 20, f = 30;
        System.out.println("==METODE MENAMPUNG==");
        System.out.println("Sebelum SWAP: a = " + a);
        System.out.println("Sebelum SWAP: b = " + b);
        System.out.println();

        int wadah = a; // wadah untuk menampung data sementara
        a = b;
        b = wadah;

        System.out.println("Setelah SWAP: a = " + a);
        System.out.println("Setelah SWAP: b = " + b);

        System.out.println();
        System.out.println("==METODE ARITMATIKA==");
        System.out.println("Sebelum SWAP: c = " + c);
        System.out.println("Sebelum SWAP: d = " + d);
        System.out.println();

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("Setelah SWAP: c = " + c);
        System.out.println("Setelah SWAP: d = " + d);

        System.out.println();
        System.out.println("==METODE XOR ^ ==");
        System.out.println("Sebelum SWAP: e = " + e);
        System.out.println("Sebelum SWAP: f = " + f);
        System.out.println();

        e = e ^ f; 
        f = e ^ f;
        e = e ^ f;

        System.out.println("Setelah SWAP: e = " + e);
        System.out.println("Setelah SWAP: f = " + f);
    }
}
