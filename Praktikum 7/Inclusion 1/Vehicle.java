/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Super class untuk menghitung harga sewa mobil dan bus
 * 
 */

public class Vehicle{
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}