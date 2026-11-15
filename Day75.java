public class Day75 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = "java";
        String kosong = "";

        // equals() -> membandingkan isi, case-sensitive
        System.out.println(a.equals(b));   // true
        System.out.println(a.equals(c));   // false

        // equalsIgnoreCase() -> membandingkan isi, huruf besar/kecil diabaikan
        System.out.println(a.equalsIgnoreCase(c));   // true

        // contains() -> cek apakah mengandung potongan teks
        String kalimat = "Belajar pemrograman Java itu seru";
        System.out.println(kalimat.contains("Java"));    // true
        System.out.println(kalimat.contains("Python"));  // false

        // isEmpty() -> cek apakah string kosong (panjang = 0)
        System.out.println(kosong.isEmpty());   // true
        System.out.println(a.isEmpty());        // false
    }
}
