/**
 * File      : DiskonLambda.java		31/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 * 
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){ 
            public double hitungDiskon(int harga){ //harus melakukan define method
                return harga - (harga * 0.3);
            }
        };
        //dengan Lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}