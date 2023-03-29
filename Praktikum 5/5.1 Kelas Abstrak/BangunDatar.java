/**
 * File      : BangunDatar.java		29/03/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
 * 
 */

public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi); //pada interface hanya bisa seperti ini
	
	public void setLuas(double l){ //tidak bisa pada diinterface karena implementasi
		luas = l; 
	}
	
	public double getLuas(){ //tidak bisa pada diinterface karena implementasi
		return luas;
	}
}