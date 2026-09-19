public class WideningDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;      // byte > short
        int i = s;        // short > int
        long l = i;       // int > long
        float f = l;      // long > float
        double d = f;     // float > double

        System.out.println("=== Widening Conversion ===");
        System.out.println("byte   b = " + b);
        System.out.println("short  s = " + s + "   byte > short");
        System.out.println("int    i = " + i + "   short > int");
        System.out.println("long   l = " + l + "   int > long");
        System.out.println("float  f = " + f + "   long > float");
        System.out.println("double d = " + d + "   float > double");

        System.out.println();
        System.out.println("=== char ke int ===");
        char c = 'A';
        int kode = c;     // char > int
        System.out.println("char c    = " + c);
        System.out.println("int  kode = " + kode + "  (kode ASCII/Unicode dari '" + c + "')");
    }
}
