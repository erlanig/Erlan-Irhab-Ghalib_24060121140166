/**
 * File      : AngkaSialException.java		01/04/23
 * Penulis   : Erlan Irhab Ghalib
 * Deskripsi : Exception buatan sendiri, menolak masukan angka 13!
 * 
 */

public class AngkaSialException extends Exception{
    //konstruktor
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}