/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Driver class untuk poligon dan kubus
 * 
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
    public static void main(String[] args) {
        Kubus kubus = new Kubus(new BujurSangkar(10));
        System.out.println("Luas Alas Kubus : " + kubus.hitungLuasAlas());    
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
    }
}