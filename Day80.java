public class Day80 {
    public static void main(String[] args) {
        // Contoh 1: mengakses elemen array dengan index
        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Elemen pertama : " + angka[0]);
        System.out.println("Elemen ketiga  : " + angka[2]);
        System.out.println("Elemen terakhir: " + angka[angka.length - 1]);

        // Mengubah elemen index 1
        angka[1] = 99;
        System.out.println("Setelah diubah : " + angka[1]);

        // Menampilkan semua elemen dengan perulangan
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ": " + angka[i]);
        }
    }
}
