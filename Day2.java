
public class Day02 {

    public static void main(String[] args) {
        String Nama = "Akhtar Fauzan";
        int Umur = 18;
        char Sex = 'L';
        boolean StatusMahasiswa = true;
        double TinggiBadan = 1.68;

        System.out.print("BIODATA MAHSISWA PRINT\n");
        System.out.print("Nama Mahasiswa: " + Nama + "\n");
        System.err.print("Umur: " + Umur + "\n");
        System.out.print("Jenis Kelamin: " + Sex + "\n");
        System.out.print("Status Mahasiswa: " + StatusMahasiswa + "\n");
        System.out.print("Tinggi badan: " + TinggiBadan + "cm \n\n");
        
        System.out.println("BIODATA MAHSISWA PRINTLN");
        System.out.println("Nama Mahasiswa: " + Nama);
        System.err.println("Umur: " + Umur);
        System.out.println("Jenis Kelamin: " + Sex);
        System.out.println("Status Mahasiswa: " + StatusMahasiswa);
        System.out.println("Tinggi badan: " + TinggiBadan + "cm \n");

        System.out.printf("BIODATA MAHSISWA PRINTF \n");
        System.out.printf("Nama Mahasiswa:%s \n",Nama);
        System.err.printf("Umur:%d \n",Umur);
        System.out.printf("Jenis Kelamin:%c \n",Sex);
        System.out.printf("Status Mahasiswa:%b \n",StatusMahasiswa);
        System.out.printf("Tinggi badan:%.2f cm \n",TinggiBadan);

    }
}
