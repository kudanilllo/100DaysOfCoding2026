public class Day74 {
    public static void main(String[] args) {
        String teks = "Belajar Java Itu Seru";

        // length() -> jumlah karakter (spasi ikut dihitung)
        System.out.println("Teks asli   : " + teks);
        System.out.println("Panjang     : " + teks.length());

        // toUpperCase() -> semua huruf jadi kapital
        System.out.println("Huruf besar : " + teks.toUpperCase());

        // toLowerCase() -> semua huruf jadi kecil
        System.out.println("Huruf kecil : " + teks.toLowerCase());
    }
}
