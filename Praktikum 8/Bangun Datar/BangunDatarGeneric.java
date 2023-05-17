/**
 * File      : BangunDatarGeneric.java		17/05/23
 * Penulis   : Erlan Irhab Ghalib (24060121140166)
 * Deskripsi : Kelas intruksi generic untuk BangunDatar
 * 
 */

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/*
 public class BangunDatarGeneric<T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
 */

/*  
Kesimpulan:
    T adalah naming convention sebagai parameter generic standarisasi, walaupun
    diganti menjadi T1, T2, T1234, dst. tetap akan berjalan dengan baik tanpa mempengaruhi 
    fungsionalitas tersebut. Jadi variabel generik T tersebut dapat disesuaikan dengan 
    keinginan/kebutuhan kita, tapi mungkin tidak sesuai dengan standarisasi yang ada.
*/

