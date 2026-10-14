mport java.util.Scanner;
public class Day46{
	public static void main(String[]args){
	int bilangan;
	Scanner sc = new Scanner(System.in);
	System.out.println("=== Mencari bilangan bulat kelipatan 3 dan 5 === ");
	System.out.print("Masukan angka yang ingin anda cek \t: ");
	bilangan = sc.nextInt();
		
	
	
		
	if(bilangan % 3 == 0){
	System.out.println(bilangan + " adalah kelipatan 3!");
	}else if(bilangan % 5 == 0){
	System.out.println(bilangan + " adalah kelipatan 5!");
	}else{
	System.out.println(bilangan + " Bukan kelipata 3 maupun 5 !");
	}
    }
}
