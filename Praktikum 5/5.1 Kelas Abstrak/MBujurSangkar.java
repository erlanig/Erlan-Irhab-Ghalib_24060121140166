/**
 * File      : MBujurSangkar.java		29/03/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * 
 */
import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar(); //untuk abstract variabel sisi dimasukan pada bs.hitungLuas(sisi));
	}
		System.out.print("Masukan sisi bujur sangkar: ");
		double sisi = scan.nextDouble(); //inputan akan masuk ke variable sisi
		scan.close(); //menutup inputan
		
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
	}
}