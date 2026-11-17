import java.util.Scanner;

public class Day77 {
    // Ubah sesuai kode prodi Informatika yang sebenarnya
    static final String KODE_PRODI_INFORMATIKA = "02";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Nama lengkap          : ");
        String namaInput = input.nextLine();
        System.out.print("Email                 : ");
        String emailInput = input.nextLine();
        System.out.print("Kode mahasiswa        : ");
        String kodeInput = input.nextLine();
        System.out.print("Password              : ");
        String password = input.nextLine();
        System.out.print("Konfirmasi password   : ");
        String konfirmasi = input.nextLine();
        System.out.print("Bio singkat           : ");
        String bio = input.nextLine();
        System.out.println();

        // ===== VALIDASI NAMA =====
        String nama = namaInput.trim();
        if (nama.isEmpty()) {
            System.out.println("Nama tidak boleh kosong");
            return;
        }

        // ===== VALIDASI EMAIL =====
        if (!emailInput.contains("@") || !emailInput.contains(".com")) {
            System.out.println("Email tidak valid");
            return;
        }
        String email = emailInput.trim().toLowerCase();

        // ===== PEMBUATAN USERNAME & DOMAIN =====
        int posisiAt = email.indexOf("@");
        String username = email.substring(0, posisiAt);
        String domain = email.substring(posisiAt + 1);

        // ===== VALIDASI KODE MAHASISWA (format: D0226305) =====
        // D = huruf awal, 02 = kode prodi, 26 = angkatan, 305 = nomor urut
        String kode = kodeInput.trim().toUpperCase();
        if (kode.length() != 8) {
            System.out.println("Format kode mahasiswa salah (contoh: D0226305)");
            return;
        }

        String huruf = kode.substring(0, 1);
        String angka = kode.substring(1);
        for (int i = 0; i < angka.length(); i++) {
            if (!Character.isDigit(angka.charAt(i))) {
                System.out.println("Format kode mahasiswa salah (contoh: D0226305)");
                return;
            }
        }

        String kodeProdi = kode.substring(1, 3);
        String tahun = "20" + kode.substring(3, 5);
        String noUrut = kode.substring(5);

        if (!huruf.equalsIgnoreCase("D")) {
            System.out.println("Kode mahasiswa harus diawali huruf D");
            return;
        }
        if (!kodeProdi.equals(KODE_PRODI_INFORMATIKA)) {
            System.out.println("Kode prodi salah");
            return;
        }

        // ===== VALIDASI PASSWORD =====
        if (password.length() < 8) {
            System.out.println("Password minimal 8 karakter");
            return;
        }
        if (!password.equals(konfirmasi)) {
            System.out.println("Password dan konfirmasi tidak sama");
            return;
        }
        if (password.equalsIgnoreCase(username)) {
            System.out.println("Password tidak boleh sama dengan username");
            return;
        }

        // ===== SENSOR BIO =====
        boolean disensor = false;
        if (bio.contains("bodoh")) {
            bio = bio.replace("bodoh", "***");
            disensor = true;
        }

        // ===== OUTPUT =====
        System.out.println("=== REGISTRASI BERHASIL ===");
        System.out.println("Nama           : " + nama.toUpperCase() + " (" + nama.length() + " karakter)");
        System.out.println("Username       : " + username);
        System.out.println("Domain         : " + domain);
        System.out.println("Kode Mhs       : " + kode);
        System.out.println("Kode Prodi     : " + kodeProdi);
        System.out.println("Angkatan       : " + tahun);
        System.out.println("No. Urut       : " + noUrut);
        System.out.println("Bio            : " + bio);
        if (disensor) {
            System.out.println("Catatan        : Bio telah disensor");
        }

        input.close();
    }
}
