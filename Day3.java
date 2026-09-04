
public class Day03 {

    public static void main(String[] args) {
        // \n  pindah baris baru
        System.out.println("=== BIODATA DIRI ===\n");

        // \t  tab untuk merapikan
        System.out.println("Nama\t: Atar");
        System.out.println("Domisili: Israel");
        System.out.println("Umur\t: 17 tahun");

        // \"  menampilkan tanda kutip dua
        System.out.println("Slogan\t: \"Hidup Jokowi\"");

        // \'  menampilkan tanda kutip satu
        System.out.println("Motto\t: Jangan pernah menyerah, kata aing mahh \'semangat!\'");

        // \\  menampilkan backslash (misal path file data)
        System.out.println("File data: D:\\Data\\Biodata\\atar.txt");

        // \r  carriage return (kembali ke awal baris, menimpa teks)
        System.out.println("Status: Sedang diproses...\rStatus: Selesai diproses  ");

        // \b  backspace (menghapus 1 karakter sebelumnya)
        System.out.println("Umur saya 177\b tahun");

        // \0  null character (biasanya tidak terlihat efeknya di teks biasa)
        System.out.println("Akhir program\0Selesai");
    }
}
