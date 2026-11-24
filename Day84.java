public class Day84 {
    public static void main(String[] args) {
        int[] nilai = { 1, 3, 4, 52, 2, 24, };
        int max = nilai[0];

        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] > max)
                max = nilai[i];

        }

        System.out.println(max);
    }
}
