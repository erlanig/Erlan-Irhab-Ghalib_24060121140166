/**
 * File      : BujurSangkar.java		15/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Representasi dasar dari objek bujur sangkar, turunan kelas poligon
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = panjangSisi; //pjgsisi kiri merujuk ke atribut atas, sebelah kanan merujuk ke parameter kanan
        this.jumlahSisi = 4;
    }

    public double hitungLuas(){
        return this.panjangSisi * this.panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}