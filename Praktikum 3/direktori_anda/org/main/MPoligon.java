/**
 * File      : MPoligon.java		08/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Driver class untuk poligon dan persegi panjang
 * 
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printinfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
        Segitiga segitiga = new Segitiga(6, 6, 3);
        segitiga.printinfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}