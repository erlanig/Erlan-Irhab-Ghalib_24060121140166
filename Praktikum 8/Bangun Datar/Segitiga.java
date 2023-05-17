/**
 * File      : Segitiga.java		17/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Implementasi Segitiga sebagai BangunDatar
 *
 */

public class Segitiga extends BangunDatar{
    private double sisi;

    public Segitiga(double sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling(){
        return sisi + sisi + sisi;
    }
}
