/**
 * File      : PersegiPanjang.java		08/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Representasi dasar dari objek segitiga, turunan kelas poligon
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi "+ this.getJumlahSisi());
    }
}
