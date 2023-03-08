/**
 * File      : PersegiPanjang.java		08/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Representasi dasar dari objek persegi panjang, turunan kelas poligon
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printinfo(){
        System.out.println("Bangun Persegi Panjang berisi "+this.getJumlahSisi());
    }
}