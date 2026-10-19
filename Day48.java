import java.util.Scanner;

public class Day48 {
    public static void main(String[]args){
        int num1, num2;
        char op;
        boolean keputusan = true;
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan angka pertama : ");
            num1 = sc.nextInt();
            System.out.print("Pilih operator (+, -, *, /, % ) : ");
             op = sc.next().charAt(0);
            System.out.print("Masukan angka kedua : ");
            num2 = sc.nextInt();

            switch (op) {
                case '+':
                    System.out.println("Hasil penjumlahan \t: " + num1 + " " +  op + " " +  num2 + " = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Hasil penjumlahan \t: " + num1 + " " +  op + " " +  num2 + " = " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Hasil penjumlahan \t: " + num1 + " " +  op + " " +  num2 + " = " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Hasil penjumlahan \t: " + num1 + " " +  op + " " +  num2 + " = " + (num1 / num2));
                    break;
                case '%':
                    System.out.println("Hasil penjumlahan \t: " + num1 + " " +  op + " " +  num2 + " = " + (num1 % num2));
                    break;
            
                default:
                    System.out.println("Angka tidak valid!");
                    break;
            }
            char decision;
            do { 
                System.out.print("Masi ingin menggunakan Kalkulator? y/n : ");

                decision = Character.toLowerCase(sc.next().charAt(0));

                if(decision == 'y'){
                    keputusan = true;
                }else if(decision == 'n'){
                    keputusan = false;
                }else{
                    System.out.println("Inputan tidak valid");
                }
            } while (decision != 'y' && decision != 'n');


        }while(keputusan);
    }
}
