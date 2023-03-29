/**
 * File      : BujurSangkar.java		29/03/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar
 * 
 */

// turunan dari kelas bangun datar
public class BujurSangkar extends BangunDatar{
	public double hitungLuas(double sisi){ //mengimplementasikan abstract method hitungLuas pada BangunDatar
		luas = sisi * sisi;
		return luas;
	}
}