/**
 * File      : BangunDatar.java		17/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Implementasi Lingkatan sebagai BangunDatar
 *
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}
