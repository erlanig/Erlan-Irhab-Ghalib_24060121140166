/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Main class untuk menghitung harga sewa mobil dan bus
 * 
*/

public class Sewa {
    public static void main(String[] args){;
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}