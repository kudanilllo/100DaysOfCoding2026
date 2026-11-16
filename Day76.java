
public class Day76 {
    public static void main(String[] args) {

        String teks = "  Belajar Java Itu Seru  ";

        // trim(): menghapus spasi di awal dan akhir
        String tanpaSpasi = teks.trim();
        System.out.println("trim()      : [" + tanpaSpasi + "]");
        // Hasil: [Belajar Java Itu Seru]

        // substring(): mengambil sebagian teks
        String bagian1 = tanpaSpasi.substring(8); // dari indeks 8 sampai akhir
        String bagian2 = tanpaSpasi.substring(0, 7); // indeks 0 sampai 6 (akhir tidak ikut)
        System.out.println("substring(8)   : " + bagian1); // Java Itu Seru
        System.out.println("substring(0,7) : " + bagian2); // Belajar

        // replace(): mengganti karakter atau kata
        String ganti1 = tanpaSpasi.replace("Seru", "Asyik");
        String ganti2 = tanpaSpasi.replace('a', '4');
        System.out.println("replace kata   : " + ganti1); // Belajar Java Itu Asyik
        System.out.println("replace karakter: " + ganti2); // Bel4j4r J4v4 Itu Seru
    }
}
