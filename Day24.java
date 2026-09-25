
import java.util.Scanner;

public class Day24 {
    public static void main(String[]args){
        int p,l,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang: ");
        p = sc.nextInt();
        System.out.print("Lebar: ");
        l = sc.nextInt();

        area = p * l;
        System.out.println("Luas persegi panjang: " + area + " cm^2");

    }

}
