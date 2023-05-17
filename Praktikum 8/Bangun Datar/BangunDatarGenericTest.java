/**
 * File      : BangunDatarGenericTest.java		17/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Main class untuk generic bangun datar
 * 
 */

public class BangunDatarGenericTest{
    public static void main(String[] args){
        //menggunakan <BangunDatar> agar bisa diakses oleh semua kelas turunannya tanpa perlu membuat
        //BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<BangunDatar>(); atau
        //BangunDatarGeneric<Segitiga> sgt = new BangunDatarGeneric<Segitiga>();

        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<BangunDatar> bdg = new BangunDatarGeneric<BangunDatar>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());
        
        Segitiga s = new Segitiga(3);
        bdg.set(s);
        System.out.println("\nKeliling segitiga : " + bdg.hitungKeliling());
        System.out.println("Tipe generic : " + bdg.get().getClass().getName());   

        //Lingkaran l = new Lingkaran(2);
        //BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<BangunDatar>();
        //bdg.set(l);
        //System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        //System.out.println("Tipe generic : " + bdg.get().getClass().getName());
        
        //Segitiga s = new Segitiga(3);
        //BangunDatarGeneric<Segitiga> sgt = new BangunDatarGeneric<Segitiga>();
        //sgt.set(s);
        //System.out.println("\nKeliling segitiga : " + sgt.hitungKeliling());
        //System.out.println("Tipe generic : " + sgt.get().getClass().getName());
    }
}