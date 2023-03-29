/**
 * File      : IArea.java		29/03/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Kelas implementasi IArea berupada cara menghitung luas lingkaran
 * 
 */

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI * jejari * jejari;
	}
}
