/**
 * File      : Bus.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Bus.java adalah kelas yang berisi metode untuk menghitung harga sewa bus
 * 
 */

public class Bus extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare-60.00f;
        System.out.println("harga sewa bus = " + fare);
    }
}