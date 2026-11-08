
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String usn, paswosrd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Buat username : ");
        usn = sc.nextLine();
        System.out.print("Buat password : ");
        paswosrd = sc.nextLine();

        System.out.println("Akun berhasil di buat");
        String inUsn = "", inpw = "";
        int indexLogin = 0;

        while (!(inUsn.equals(usn) && inpw.equals(paswosrd))) {
            System.out.print("username : ");
            inUsn = sc.nextLine();
            System.out.print("password : ");
            inpw = sc.nextLine();
            indexLogin++;
        }
        System.out.println("Login berhasil! Selamat datang, " + usn);
        System.out.println("Jumlah percobaan login : " + indexLogin);
    }
}
