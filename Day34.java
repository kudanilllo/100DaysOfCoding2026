public class Day34 {
    public static void main(String[] args) {
        int nilaiUjian = 90;

        if (nilaiUjian >= 70) { // nilai di atas 70 atau 70 akan bernilai true
            System.out.println("Anda lulus!"); // kode ini akan di jalankan jika kondisi if di atas bernilai true
        } else if (nilaiUjian < 70) {// pengeceekan akan turun di else if jika kondisi di atas nya false
            System.out.println("Maaf anda tidak lulus!");// kode ini akan di eksekusi apabila kondisi else if true
        } else { // kode ini akan di eksekusi apabila kondisi di atas tidak ada yang benar
            System.out.println("Tolong selesaikan ujian untuk mendaptkan nilai!");
        }

    }
}
