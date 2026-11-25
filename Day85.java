public class Day84 {
    public static void main(String[] args) {
        int[] nilai = { 1, 3, 4, 52, 2, 24, };
        int min = nilai[0];

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] < max)
                min = nilai[i];

        }

        System.out.println(min);
    }
}
