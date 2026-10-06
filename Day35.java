public class Day35 {
    public static void main(String[] args) {
        int umur = 20;
        boolean punyaKTP = true;

        if (umur >= 17) {
            // masuk sini hanya jika umur >= 17
            if (punyaKTP) {
                System.out.println("Boleh mendaftar");
            } else {
                System.out.println("Buat KTP dulu");
            }
        } else {
            System.out.println("Belum cukup umur");
        }
        
    }
}
