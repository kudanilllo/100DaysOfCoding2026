import java.util.Scanner;

public class AkunLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== BUAT AKUN =====
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Username : ");
        String userAkun = input.nextLine();
        System.out.print("Password : ");
        String passAkun = input.nextLine();
        System.out.println("Akun berhasil dibuat!\n");

        // ===== LOGIN (loop sampai benar) =====
        System.out.println("=== LOGIN ===");
        boolean berhasil = false;

        while (!berhasil) {
            System.out.print("Username : ");
            String user = input.nextLine();
            System.out.print("Password : ");
            String pass = input.nextLine();

            if (user.equals(userAkun) && pass.equals(passAkun)) {
                System.out.println("Login berhasil! Selamat datang, " + user);
                berhasil = true; // loop berhenti
            } else {
                System.out.println("Username atau password salah, coba lagi.\n");
            }
        }

        input.close();
    }
}
