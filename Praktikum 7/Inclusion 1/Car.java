/**
 * File      : Car.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Car.java adalah kelas yang berisi metode untuk menghitung harga sewa mobil
 * 
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}