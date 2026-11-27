import java.util.Arrays;

public class Day87 {
    public static void main(String[] args) {
        int[] nilai = {1,5,3,2,6,7};

        nilai[5] = 9;

        int total = 0;
        for (int i : nilai) {
            total += i;
        }

        Arrays.sort(nilai);
        System.out.println("Nilai : " + Arrays.toString(nilai));
        System.out.println("Total array \t: " + total);
     
    }
}
